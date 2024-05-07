use sys;

create table Product(
	id integer,
    name VARCHAR(255),
    price DECIMAL(10,2),
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );

insert into Product (id, name, price, description) values (1, 'Laptop', 999.99, 'High-performance laptop with SSD storage.');
insert into Product (id, name, price, description) values (2, 'Smartphone', 599.50, '4G smartphone with advanced camera features.');
insert into Product (id, name, price, description) values (3, 'Headphones', 79.99, 'Wireless headphones with noise-canceling technology.');  

-- Query 
-- (Select and display all products from the "Product" table sorted by name in ascending order.)
select * from Product where name is not null order by name;
-- Select and display the product with the highest price from the "Product" table.
select * from Product where price is not null order by price desc;
select max(price) from Product;


-- Select and display the count of products in the "Product" table.
-- Tip: count()
select count(*) AS count FROM Product;

-- Select and display all products from the "Product" table where the name contains the word "laptop" (case-insensitive).
select * from Product where name like '%laptop%';

-- Select and display the average price of all products in the "Product" table.
select AVG(price) AS Average_price FROM Product;

-- Select and display the product with the earliest created_at timestamp from the "Product" table.
select * from Product where created_at is not null order by created_at LIMIT 1;

-- Select and display the sum of prices for all products in the "Product" table. 
-- Alias the sum result as "Total Price" in the output.
select SUM(price) AS 'Total Price' From Product;

-- Select and display the lowest price among products with names containing the word "phone" (case-insensitive). 
-- Alias the max price result as "Max Price for Phones" in the output.
select LOWER(price) AS 'Max price for Phones' From Product Where name like '%phone%';

-- Select and display all products from the "Product" table where the description contains the word "wireless" (case-insensitive). 
-- Alias the "description" column as "Product Description" in the output.
-- tips: lower() and like
select description AS 'Product Description' From Product Where LOWER(description) like '%wireless%';

select * from Product;





create table Sales (
	id integer,
	product_id integer,
	product_name varchar(255),
	unit_price DECIMAL(10,2),
	quantity_sold integer,
	discount_amount DECIMAL(10,2),
	tax_rate DECIMAL(5,2),
	shipping_cost DECIMAL(10,2),
	handling_fee DECIMAL(10,2)
);

insert into Sales (id, product_id, product_name, unit_price, quantity_sold, discount_amount, tax_rate, shipping_cost, handling_fee) 
values 
(1, 1, 'Laptop', 999.99, 2, 0.00, 0.05, 10.50, 5.25),
(2, 2, 'Smartphone', 599.50, 5, 25.75, 0.075, 5.75, 3.25),
(3, 3, 'Headphones', 79.99, 10, 5.00, 0.05, 2.99, 1.50);
  
select * from Sales;





  