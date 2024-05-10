create table players (
    player_id integer not null unique, 
    group_id integer not null
);

create table matches (
    match_id integer not null unique, 
    first_player integer not null, 
    second_player integer not null, 
    first_score integer not null, 
    second_score integer not null
);

INSERT into players
(player_id, group_id) values
(20,2),
(30,1),
(40,3),
(45,1),
(50,2),
(65,1);

INSERT into matches 
(match_id, first_player, second_player, first_score, second_score) values
(1,30,45,10,12),
(2,20,50,5,5),
(13,65,45,10,10),
(5,30,65,3,15),
(42,45,65,8,4);

select * from players;
select * from matches;
-- Expected Query Result:
-- Group_id | winner_id
-- 1		| 45
-- 2		| 20
-- 3		| 40


-- processing...........
WITH TotalScore as 
	(select p.group_id, p.player_id, sum(m.first_score) as total_score
		from PLAYERS P INNER JOIN MATCHES M
		on p.player_id = m.first_player
		Group by p.group_id, p.player_id
	Union
		select p.group_id, p.player_id, sum(m.second_score) as total_score
		from PLAYERS P INNER JOIN MATCHES M
		on p.player_id = m.second_player
		Group by p.group_id, p.player_id
	)
select Distinct on (ts.Group_id) p.Group_id, p.Player_id as winner_id
from Players P left join TotalScore TS 
	on TS.Group_id = p.Group_id
Order by ts.Group_id, ts.total_score;


-- left join view
WITH TotalScore as 
	(select p.group_id, p.player_id, sum(m.first_score) as total_score
		from PLAYERS P INNER JOIN MATCHES M
		on p.player_id = m.first_player
		Group by p.group_id, p.player_id
	Union
		select p.group_id, p.player_id, sum(m.second_score) as total_score
		from PLAYERS P INNER JOIN MATCHES M
		on p.player_id = m.second_player
		Group by p.group_id, p.player_id
	)
select ts.*, p.*
from Players P left join TotalScore TS 
	on TS.Group_id = p.Group_id;
