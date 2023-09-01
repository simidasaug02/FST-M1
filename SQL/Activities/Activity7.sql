REM   Script: Activity7
REM   Perform Aggregate Operations on Orders


select sum(PURCHASE_AMOUNT) from orders ;

select sum(PURCHASE_AMOUNT) as SUM from orders ;

select AVG(PURCHASE_AMOUNT) as AVG_SUM from orders ;

select MAX(PURCHASE_AMOUNT) as MAX_SUM from orders ;

select MIN(PURCHASE_AMOUNT) as MIN_SUM from orders ;

select * from orders;

select count(SALESMAN_ID) as Total_Nos_Salesman from orders ;

select count(distinct SALESMAN_ID) as Total_Nos_Salesman from orders ;



