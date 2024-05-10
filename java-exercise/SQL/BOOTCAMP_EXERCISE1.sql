CREATE DATABASE BOOTCAMP_EXERCISE1;
USE BOOTCAMP_EXERCISE1;

create table employees (
	Employee_ID INT AUTO_INCREMENT,
    First_name VARCHAR(20),
    Last_name VARCHAR(25),
    Email VARCHAR(20),
    Phone_number VARCHAR(20),
    Hire_date Date,
    Job_ID VARCHAR(10),
    Salary DECIMAL(5,2),
    Commission_PCT DECIMAL(5,2),
    Manager_ID INT,
    Department_ID INT,
    CONSTRAINT FK_EmployeeJobHistory foreign key (Employee_ID) references Job_history(Employee_ID),
    CONSTRAINT FK_EmployeeJob foreign key (Job_ID) references Jobs(Job_ID),
    CONSTRAINT FK_EmployeeDepartment foreign key (Department_ID) references Departments(Department_ID)
);
alter table Employees change column Manager Manager_ID INT;
alter table Employees modify column Salary Decimal(7,2); 
alter table Employees modify column Commission_PCT Decimal (7,2);

select * from employees;

create table Departments (
	Department_ID int KEY AUTO_INCREMENT,
    Department_Name VARCHAR(30),
    Manager_ID int,
    Location_ID int,
    CONSTRAINT FK_DepartmentLocation foreign key (Location_ID) references Locations(Location_ID)
);
select * from departments;

create table Locations (
	Location_ID int KEY AUTO_INCREMENT,
    Street_Address VARCHAR(25),
    Postal_code VARCHAR(12),
    City VARCHAR(30),
    State_Province VARCHAR(12),
    Country_ID CHAR(2),
    CONSTRAINT FK_LocationCountry foreign key (Country_ID) references Countries(Country_ID)
);
select * from Locations;

create table Countries (
	Country_ID CHAR(2) PRIMARY KEY,
    Country_name VARCHAR(40),
    Region_ID int,
    CONSTRAINT FK_CountryRegion foreign key (Region_ID) references Regions(Region_ID)
);
select * from Countries;

create table Regions (
	Region_ID int AUTO_INCREMENT,
    Region_name VARCHAR(25)
);
select * from Regions;

create table Job_history (
    Start_Date date,
    End_date date,
    Employee_ID int,
    Job_ID VARCHAR(10),
    Department_ID int,
    PRIMARY KEY (Employee_ID, Start_Date),
    CONSTRAINT FK_JobHistoryJob foreign key (Job_ID) references Jobs(Job_ID),
    CONSTRAINT FK_JobHistoryDepartment foreign key (Department_ID) references Departments(Department_ID)
);
select * from Job_history;

create table Jobs (
	Job_ID VARCHAR(10) Primary Key,
    Job_Title VARCHAR(35),
    Min_Salary DECIMAL(5,2),
    Max_Salary DECIMAL(5,2)
);
alter table Jobs MODIFY COLUMN Min_Salary DECIMAL(7,2);
alter table Jobs MODIFY COLUMN Max_Salary DECIMAL(7,2);
select * from Jobs;

#create table Job_grades (
#	Grade_level VARCHAR(2) AUTO_INCREMENT,
#    Lowest_Sal DECIMAL(5,2),
#    Highist DECIMAL(5,2)
#);

-- REGIONS
INSERT INTO REGIONS (REGION_ID, REGION_NAME) VALUES
(1, 'North America'),
(2, 'Europe'),
(3, 'Asia');
select * from REGIONS;

-- COUNTRIES
INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID) VALUES
(1, 'United States', 1),
(2, 'United Kingdom', 2),
(3, 'Japan', 3);
select * from COUNTRIES;

-- LOCATIONS
INSERT INTO LOCATIONS (LOCATION_ID, STREET_ADDRESS, POSTAL_CODE, CITY, STATE_PROVINCE, COUNTRY_ID) VALUES
(1001, '123 Main St', '12345', 'New York', 'NY', 1),
(1002, '456 Elm St', '67890', 'London', NULL, 2),
(1003, '789 Oak St', '98765', 'Tokyo', NULL, 3);
select * from LOCATIONS;

-- DEPARTMENTS
INSERT INTO DEPARTMENTS (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID) VALUES
(10, 'Sales', 101, 1001),
(20, 'HR', 102, 1002),
(30, 'IT', 103, 1003);
select * from DEPARTMENTS;

-- JOBS
INSERT INTO JOBS (JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY) VALUES
('SALESMAN', 'Salesman', 30000, 60000),
('HR_REP', 'HR Representative', 35000, 70000),
('IT_PROG', 'IT Programmer', 40000, 80000);
select * from JOBS;

-- EMPLOYEES
INSERT INTO EMPLOYEES (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID) VALUES
(101, 'John', 'Doe', 'john@example.com', '123-456-7890', '2023-01-15', 'SALESMAN', 50000, 0.05, 103, 10),
(102, 'Jane', 'Smith', 'jane@example.com', '987-654-3210', '2023-02-20', 'HR_REP', 55000, 0.07, 103, 20),
(103, 'Michael', 'Johnson', 'michael@example.com', '555-123-4567', '2023-03-25', 'IT_PROG', 60000, 0.06, 103, 30);
select * from EMPLOYEES;
update employees
set first_name = 'Lex', last_name = 'De Haan'
where first_name = 'Jane' and last_name = 'Smith';

INSERT INTO EMPLOYEES Values
(104, 'Jack', 'Malfod', 'Jack@example.com', '321-987-9292', '2022-08-15', 'SALESMAN', 55000, 0.05, 103, 10),
(105, 'Jane', 'Smith', 'jane@example.com', '928-876-0376', '2020-07-20', 'HR_REP', 58000, 0.07, 103, 20),
(106, 'May', 'Parker', 'May@example.com', '234-987-0009', '2021-08-25', 'IT_PROG', 65000, 0.06, 103, 30);

-- JOB_HISTORY
INSERT INTO JOB_HISTORY (START_DATE, END_DATE, JOB_ID, DEPARTMENT_ID, EMPLOYEE_ID) VALUES
('2023-01-15', '2023-05-15', 'SALESMAN', 10, 101),
('2023-02-20', '2023-06-20', 'HR_REP', 20, 102),
('2023-03-25', NULL, 'IT_PROG', 30, 103);
select * from Job_history;

# 3. Write a query to find the location_id, street_address, city, state_province, country_name of locations
select L.location_id, L.street_address, L.city, L.state_province, C.country_name
from LOCATIONS L inner join COUNTRIES C on L.COUNTRY_ID = C.COUNTRY_ID;

# 4. Write a query to find the first_name, last name, department ID of all the employees.
select first_name, last_name, DEPARTMENT_ID
from Employees;

# 5. Write a query to find the first_name, last_name, job_id, department ID of the employees who works in Japan.
select e.first_name, e.last_name, e.department_id
from Employees e inner join Departments d on e.department_id = d.department_id
where d.location_id = 1003;

# 6. Write a query to find the employee id, last_name along with their manager_id and last_name.
select e2.employee_id, e2.last_name, e2.manager_ID, e1.last_name as 'manager_last_name'
from employees e1 inner join employees e2 on e1.employee_id = e2.manager_ID;

# 7. Write a query to find the first_name, last_name and hire date of the employees who was hired after employee • 'Lex De Haan'.
select first_name, last_name, hire_date as 'Hire date of who was hired after employee • Lex De Haan'
from employees
where HIRE_DATE > (
	select HIRE_DATE
    from Employees
    where employee_id = 102
);

# 8. Write a query to get the department name and number of employees of each the department.
select d.Department_name, count(e.department_ID) as No_of_Employee
from Departments d inner join Employees e on d.department_ID = e.department_ID
Group by d.Department_name
;

# 9. Write a query to find the employee ID, job title, number of days between ending date and starting date for all jobs in department ID 30.
select e.employee_ID, j.Job_title, datediff(COALESCE(jh.END_DATE, CURDATE()), jh.START_DATE) as 'number of days for all jobs in department ID 30'
from Job_history jh inner join employees e inner join jobs j
on jh.employee_ID = e.employee_ID 
and jh.job_ID = j.job_ID
where jh.department_ID = 30
;

# 10. Write a query to display all department name, manager name, city and country name.
select D.Department_name, concat(E.First_name, ' ', E.Last_name) as 'Manager name', L.City, C.Country_name
from Departments D inner join Locations L inner join Countries C inner join employees E 
on D.Location_ID = L.Location_ID
and L.Country_ID = C.Country_ID
and D.Department_ID = E.Department_ID;

# 11. Write a query to display the average salary of each department.
select D.Department_name, avg(E.salary)
from Employees E inner join Departments D
on E.Department_ID = D.Department_ID
Group by D.Department_name;

# 12. Now, we try to perform normalization on table 'jobs'.
# a. How do you re-design the table 'jobs'? and adding table 'job_grades'?

drop table jobs;
create table Jobs (
	Job_ID VARCHAR(10) Primary Key,
    Job_Title VARCHAR(35),
    Title_level INTEGER,
    CONSTRAINT FK_JobGrade foreign key (Title_level) references Job_grades(Title_level)
);
alter table Employees drop CONSTRAINT FK_EmployeeJob;
alter table Job_history drop CONSTRAINT FK_JobHistoryJob;
drop table jobs;
select * from Jobs;
Alter table employees add CONSTRAINT FK_EmployeeJob foreign key (Job_ID) references Jobs(Job_ID);
Alter table Job_history add CONSTRAINT FK_JobHistoryJob foreign key (Job_ID) references Job_history(Job_ID);

-- JOBS
INSERT INTO JOBS (JOB_ID, JOB_TITLE, Title_level) VALUES
('SALESMAN', 'Salesman', 2),
('HR_REP', 'HR Representative', 1),
('IT_PROG', 'IT Programmer', 3);
select * from JOBS;

create table Job_grades (
	Title_level INT PRIMARY KEY,
    Lowest_Salary DECIMAL(7,2),
    Highist_Salary DECIMAL(7,2)
);
select * from Job_grades;
drop table Job_grades;

-- JOBS GRADES
INSERT INTO Job_grades (Title_level, Lowest_Salary, Highist_Salary) VALUES
(1, 30000, 40000),
(2, 50000, 60000),
(3, 60000, 80000);
select * from Job_grades;
