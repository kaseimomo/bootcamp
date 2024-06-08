Table comments {
  id integer
  post_id integer
  email varcharr
  body varchar 
}

Table posts {
  id integer [primary key]
  user_id long 
  title varchar
  body varchar
}

Table users {
  id integer [primary key]
  name varchar
  username varchar
  email varchar
  addrStreet varchar
  addrSuite varchar
  addrCity varchar
  addrZipcode varchar
  addrLat varchar
  addrLong varchar
  phone varchar
  website varchar
  companyName varchar
  companyCatchPhrase varchar
  companyBS varchar
}

Ref: users.id < posts.user_id 

Ref: posts.id < comments.post_id



/Users/charleschan/bootcamp/bc2403-sb/bc-forum/Tables.png