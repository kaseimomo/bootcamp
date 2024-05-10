CREATE DATABASE BOOTCAMP_EXERCISE3;
USE BOOTCAMP_EXERCISE3;
#Q1A
Create table Customer(
	id INTEGER PRIMARY KEY,
    customer_name VARCHAR(255),
    city_id INTEGER,
    customer_address VARCHAR(255),
    contact_person VARCHAR(255) NOT NULL,
    email VARCHAR(128),
    phone VARCHAR(128)
);

create table product (
	ID INTEGER PRIMARY KEY,
    sku VARCHAR(32),
    product_name VARCHAR(128),
    product_description TEXT,
    current_price DECIMAL(8,2),
    quantity_in_stock INTEGER
);


create table invoice(
	id INTEGER PRIMARY KEY,
    invoice_number varchar(255),
    customer_id INTEGER,
    user_account_id INTEGER,
    total_price decimal(8,2),
    time_issued TIMESTAMP,
    time_due TIMESTAMP,
    time_paid TIMESTAMP,
    time_canceled TIMESTAMP,
    time_refunded TIMESTAMP,
    CONSTRAINT FK_CustomerInvoice foreign key (customer_id) references Customer(id)
);
select * from invoice;
ALTER TABLE invoice_item DROP FOREIGN KEY FK_InvoiceItemID;


create table invoice_item (
	id INTEGER PRIMARY KEY,
    invoice_id INTEGER,
    product_id INTEGER,
    quantity INTEGER,
    price DECIMAL(8,2),
    line_total_price DECIMAL(8,2),
    CONSTRAINT FK_InvoiceItemID foreign key (invoice_id) references invoice(id),
    CONSTRAINT FK_InvoiceProductID foreign key (product_id) references product(id)
);


#Q1B
-- Sample Data
DELETE FROM CUSTOMER;
INSERT INTO CUSTOMER VALUES
(1, 'Drogerie Wien', 1, 'Deckergasse 15A', 'Emil Steinbach', 'abc@gmail.com', 123455678);
INSERT INTO CUSTOMER VALUES
(2, 'John', 4, 'Deckergasse 1A', '9upper', 'abck@gmail.com', 12345567);
INSERT INTO CUSTOMER VALUES
(3, 'Mary', 8, 'Deckergasse 18A', '9upper', 'abcd@gmail.com', 1234556789);

DELETE FROM PRODUCT;
INSERT INTO PRODUCT VALUES
(1, '330120', '9UP PRODUCT', 'COMPLETELY 9UP', 60, 122);
INSERT INTO PRODUCT VALUES
(2, '330121', '9UPPER PRODUCT', 'COMPLETELY 9UPPER', 50, 50);
INSERT INTO PRODUCT VALUES
(3, '330122', '9UPPER PRODUCTS', 'SUPER 9UPPER', 40, 600);
INSERT INTO PRODUCT VALUES
(4, '330123', '9UPPER PRODUCTSS', 'SUPER COMPLETELY 9UPPER', 30, 500);

DELETE FROM INVOICE;
INSERT INTO INVOICE VALUES
(1, 'in_ 25181b07ba800c8d2c967fe991807d9', 2, 41, 1423, '2019-07-20 15:05:07', '2019-07-27 15:05:07', '2019-07-25 9:24:12', NULL, NULL);
INSERT INTO INVOICE VALUES
(2, '8fba0000fd456b27502b9f81e9d52481', 3, 42, 1400, '2019-7-20 15:07:11', '2019-7-27 15:07:11', '2019-7-20 15:10:32', NULL, NULL);
INSERT INTO INVOICE VALUES
(3, '366638118246b6bcfd3dfcd9be487599', 2, 43, 17000, '2019-7-20 15:06:15', '2019-7-27 15:06:15', '2019-7-31 21:22:11', NULL, NULL);
select * from invoice;

DELETE FROM INVOICE_ITEM;
INSERT INTO INVOICE_ITEM VALUES
(1, 1, 1, 40, 23, 920);
INSERT INTO INVOICE_ITEM VALUES
(2, 1, 2, 4, 20, 80);
INSERT INTO INVOICE_ITEM VALUES
(3, 1, 3, 4, 10, 40);
INSERT INTO INVOICE_ITEM VALUES
(4, 1, 2, 4, 30, 120);
select * from INVOICE_ITEM;

#Q1C
#Using the UNION operator, in one list return all customers who do not have an invoice and all products that were not sold.
#For each customer without an invoice, return:
#• the string customer ??
#• the string product ??

-- No invoice customers
select 'customer' as List, c.id, c.customer_name
from Customer c LEFT join Invoice i on c.id = i.customer_id
where i.customer_id is null
UNION
-- All products that were not sold
select 'product' as List,p.id, p.product_name
from Product p LEFT join Invoice_item ii on p.id = ii.product_id
where ii.product_id is null;

#Q2
-- Table Structure
-- DROP TABLE EMPLOYEE;
CREATE TABLE EMPLOYEE (
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	EMPLOYEE_NAME VARCHAR(30) NOT NULL,
	SALARY NUMERIC (8,2),
	PHONE NUMERIC (15),
	EMAIL VARCHAR (50),
	DEPT_ID INTEGER NOT NULL
);

-- DROP TABLE DEPARTMENT;
CREATE TABLE DEPARTMENT (
ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
DEPT_CODE VARCHAR (3) NOT NULL,
DEPT_NAME VARCHAR (200) NOT NULL
);

-- Sample Data
DELETE FROM EMPLOYEE;
INSERT INTO EMPLOYEE 
(ID, EMPLOYEE_NAME, SALARY, PHONE, EMAIL, DEPT_ID) VALUES 
(1, 'JOHN', 20000, 90234567, 'JOHN@GMAIL.COM', 1),
(2, 'MARY', 10000, 90234561, 'MARY@GMAIL.COM', 1),
(3, 'STEVE', 30000, 90234562, 'STEVE@GMAIL.COM', 3),
(4, 'SUNNY', 40000, 90234563, 'SUNNY@GMAIL.COM', 4) ;
select * from EMPLOYEE;

DELETE FROM DEPARTMENT;
INSERT INTO DEPARTMENT 
(ID, DEPT_CODE, DEPT_NAME) VALUES 
(1, 'HR', 'HUMAN RESOURCES'),
(2, '9UP', '9UP DEPARTMENT'),
(3, 'SA', 'SALES DEPARTMENT'),
(4, 'IT', 'INFORMATION TECHNOLOGY DEPARTMENT') ;
select * from DEPARTMENT;

#Q2a
select D.DEPT_CODE as 'Department Code', COUNT(E.DEPT_ID) as 'Number of Employees'
from DEPARTMENT D left join EMPLOYEE E
on D.ID = E.DEPT_ID
group by D.dept_code, E.DEPT_ID
order by COUNT(E.DEPT_ID) desc, D.DEPT_CODE
;

#Q2b
Delete from department 
where ID = 5;
Insert into department VALUES
(5, 'IT', 'INFORMATION TECHNOLOGY DEPARTMENT');
#Q2a SQL is still working after delete ID = 5 and the new insert data. 
# NOT NULL AUTO_INCREMENT PRIMARY KEY
#1. There is no ID 5 from table department before delete ID = 5.

