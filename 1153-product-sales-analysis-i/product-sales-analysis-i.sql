# Write your MySQL query statement below
select product_name, year, price
from Sales s1
left join Product p1
on s1.product_id=p1.product_id;

