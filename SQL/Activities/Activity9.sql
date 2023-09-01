REM   Script: Activity9
REM   Join Operations

create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);


INSERT ALL
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001)
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002)
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002)
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;



SELECT a.customer_name, a.city, b.name AS "Salesman", b.commission FROM customers a 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;


select distinct customers.CUSTOMERID,customers.CUSTOMERNAME,salesman.SALESMAN_ID,salesman.SALESMAN_NAME,salesman.grade 
from customers,orders,salesman  
where customers.customerid=orders.CUSTOMER_ID 
and orders.SALESMAN_ID=salesman.SALESMAN_ID   
and salesman.grade>300 
order by customers.CUSTOMERID asc ;

select distinct customers.CUSTOMERID,customers.CUSTOMERNAME,salesman.SALESMAN_ID,salesman.SALESMAN_NAME,salesman.grade 
from customers,orders,salesman  
where customers.customerid=orders.CUSTOMER_ID 
and orders.SALESMAN_ID=salesman.SALESMAN_ID   
and salesman.grade<300 
order by customers.CUSTOMERID asc;

commit;


select distinct customers.CUSTOMERID,customers.CUSTOMERNAME,salesman.SALESMAN_ID,salesman.SALESMAN_NAME,salesman.grade,salesman.COMMISSION 
from customers,orders,salesman  
where customers.customerid=orders.CUSTOMER_ID 
and orders.SALESMAN_ID=salesman.SALESMAN_ID   
and salesman.COMMISSION>12 
order by customers.CUSTOMERID asc;



select distinct customers.CUSTOMERID,customers.CUSTOMERNAME,salesman.SALESMAN_ID,salesman.SALESMAN_NAME,salesman.COMMISSION, 
orders.ORDER_NO,orders.PURCHASE_AMOUNT,orders.ORDER_DATE 
from customers,orders,salesman  
where customers.customerid=orders.CUSTOMER_ID 
and orders.SALESMAN_ID=salesman.SALESMAN_ID   
order by customers.CUSTOMERID asc;

