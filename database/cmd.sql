//create database

create database database
create database demo1

//create table

create table tablename(colname datatype, col2 database ,col3 database)

create table employee(id int, name varchar(100), salary int);

//adding the data to database
//if you want to insert row for some col
insert into tablename(col,col2,col3) values(val1,val2,val3);

insert values for all the columns
inset into tablename values();

/update the data in table
update employee set col1=new value where  col='condition'

deletethe data from table

delete from tablename where col1='condition'



//see the data
Select * from tablename;


Enter password: ****
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.25 MySQL Community Server - GPL

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use demo1;
Database changed
mysql> show tables;
+-----------------+
| Tables_in_demo1 |
+-----------------+
| employee        |
+-----------------+
1 row in set (0.21 sec)

mysql> select * from employee;
+------+----------+--------+
| id   | name     | salary |
+------+----------+--------+
|    1 | ravinder |   1000 |
+------+----------+--------+
1 row in set (0.03 sec)

mysql> desc employee;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| id     | int         | YES  |     | NULL    |       |
| name   | varchar(10) | YES  |     | NULL    |       |
| salary | int         | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
3 rows in set (0.02 sec)

mysql> insert into employee(id,name , salary) values(2,'kumar',1000);
Query OK, 1 row affected (0.03 sec)

mysql> insert into employee(id,name , salary) values(3,'priya',2000);
Query OK, 1 row affected (0.28 sec)

mysql> insert into employee value(4,'Mahesh',1000);
Query OK, 1 row affected (0.26 sec)

mysql> select * from employee;
+------+----------+--------+
| id   | name     | salary |
+------+----------+--------+
|    1 | ravinder |   1000 |
|    2 | kumar    |   1000 |
|    3 | priya    |   2000 |
|    4 | Mahesh   |   1000 |
+------+----------+--------+
4 rows in set (0.25 sec)

mysql> update employee set salary=2000 where id=1;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from employee;
+------+----------+--------+
| id   | name     | salary |
+------+----------+--------+
|    1 | ravinder |   2000 |
|    2 | kumar    |   1000 |
|    3 | priya    |   2000 |
|    4 | Mahesh   |   1000 |
+------+----------+--------+
4 rows in set (0.00 sec)

mysql> update employee set salary=2000;
Query OK, 2 rows affected (0.01 sec)
Rows matched: 4  Changed: 2  Warnings: 0

mysql> select * from employee;
+------+----------+--------+
| id   | name     | salary |
+------+----------+--------+
|    1 | ravinder |   2000 |
|    2 | kumar    |   2000 |
|    3 | priya    |   2000 |
|    4 | Mahesh   |   2000 |
+------+----------+--------+
4 rows in set (0.00 sec)

mysql> delete from employee where id=4;
Query OK, 1 row affected (0.26 sec)

mysql> select * from employee;
+------+----------+--------+
| id   | name     | salary |
+------+----------+--------+
|    1 | ravinder |   2000 |
|    2 | kumar    |   2000 |
|    3 | priya    |   2000 |
+------+----------+--------+
3 rows in set (0.00 sec)

mysql> delete from employee;
Query OK, 3 rows affected (0.01 sec)

mysql> select * from employee;
Empty set (0.00 sec)

mysql> select * from employee where id=3;
Empty set (0.00 sec)

mysql> insert into employee value(4,'Mahesh',1000);
Query OK, 1 row affected (0.26 sec)

mysql> insert into employee value(1,'Mahesh',1000);
Query OK, 1 row affected (0.00 sec)

mysql> drop database demo1;
Query OK, 1 row affected (0.07 sec)

mysql> use demo1;
ERROR 1049 (42000): Unknown database 'demo1'
mysql> create database demo1;
Query OK, 1 row affected (0.01 sec)

mysql> use demo1;
Database changed
mysql> create table dept(id int , deptname varchar(10) , location varchar(100));
Query OK, 0 rows affected (0.30 sec)

mysql> desc dept;
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| id       | int          | YES  |     | NULL    |       |
| deptname | varchar(10)  | YES  |     | NULL    |       |
| location | varchar(100) | YES  |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+
3 rows in set (0.01 sec)

mysql> insert into dept values(1, 'IT','Delhi');
Query OK, 1 row affected (0.01 sec)

mysql> insert into dept values(2, 'Sale','Chandigarh');
Query OK, 1 row affected (0.01 sec)

mysql> insert into dept values(3, 'Purchase','Delhi');
Query OK, 1 row affected (0.25 sec)

mysql> select * from dept;
+------+----------+------------+
| id   | deptname | location   |
+------+----------+------------+
|    1 | IT       | Delhi      |
|    2 | Sale     | Chandigarh |
|    3 | Purchase | Delhi      |
+------+----------+------------+
3 rows in set (0.00 sec)

mysql> update dept set location='Delhi' where id=2;
Query OK, 1 row affected (0.15 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from dept;
+------+----------+----------+
| id   | deptname | location |
+------+----------+----------+
|    1 | IT       | Delhi    |
|    2 | Sale     | Delhi    |
|    3 | Purchase | Delhi    |
+------+----------+----------+
3 rows in set (0.25 sec)

mysql> delete from dept where id=3;
Query OK, 1 row affected (0.26 sec)

mysql> delete from dept where location='Delhi';
Query OK, 2 rows affected (0.01 sec)

mysql> drop database demo1;
Query OK, 1 row affected (0.29 sec)


