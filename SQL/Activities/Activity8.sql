REM   Script: Activity8
REM   Group By Operations on Orders



select CUSTOMER_ID,MAX(PURCHASE_AMOUNT) from orders group by CUSTOMER_ID ;

select SALESMAN_ID,ORDER_DATE,MAX(PURCHASE_AMOUNT) from orders where ORDER_DATE=to_date('2012/08/17', 'YYYY/MM/DD')  
group by SALESMAN_ID,ORDER_DATE ;

select customer_id,ORDER_DATE,MAX(PURCHASE_AMOUNT) from orders  
group by customer_id,ORDER_DATE HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000) ;

