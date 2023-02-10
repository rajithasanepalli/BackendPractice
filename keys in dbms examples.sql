use moritech;

drop table department;

-- primary key example 
create table department(deptid varchar(10) primary key,deptname varchar(30));

-- primary key second syntax
create table employee(empid varchar(10),empname varchar(50),empdob date,
						empemail varchar(30),primary key(empid));

-- altering course table to apply primary key
alter table instructor add primary key (instructorid);

drop table project;

-- adding primary key with name
create table project(projectid varchar(10),projectname varchar(30),
						constraint project_pk primary key(projectid));
                        
create table project(projectid varchar(10),projectname varchar(30),
						 primary key project_pk (projectid));                        
                        
-- drop the primary key
alter table project drop primary key;

-- alter the table to add primary key with name
alter table project add CONSTRAINT  project_pk primary key(projectid);

-- drop the primary key constraint using constraint name
alter table project drop  CONSTRAINT  project_pk;

-- above statement throws an error because according to mysql documentation
    -- primary key is stored with the name primary 
    
-- Foreign Key

-- adding foreign key using alter
alter table employee add column  deptid varchar(10);
ALTER TABLE `employee` ADD FOREIGN KEY (`deptid`) REFERENCES 
		`department` (`deptid`);

alter table employee add CONSTRAINT  emp_fk_dept FOREIGN KEY (`deptid`) REFERENCES 
		`department` (`deptid`);
        
 drop table employee;       
        
-- drop foreign key using alter
alter table employee drop constraint emp_fk_dept ;

-- drop foreign key using alter
alter table employee drop foreign key emp_fk_dept ;

-- create a table with deptid as foreign key
create table branch (branchid int primary key,
						branchname varchar(30),
                        deptid varchar(10),
                        constraint fk_branch_dept foreign key(deptid)
                        references department(deptid));
                        
--  create the foreign key with restrictions
create table location (locationid int primary key,
						locationname varchar(30),
                        branchid int,
                        constraint fk_location_branch foreign key(branchid)
                        references branch(branchid)
                        on update set null
                        on delete cascade);

-- composite key
create table student(s_name  varchar(30), s_branch  varchar(30),s_contact int,s_age int , constraint composite_key_example 
			Primary key(s_name,s_contact));
-- auto increment example
create table employee_shift(emp_shift_id int primary key auto_increment,empname  varchar(30),shiftstarttime TIME,shiftendtime TIME);
