# Write your MySQL query statement below
-- select t1.id,t2.id,t1.recordDate ,t2.recordDate ,t1.temperature, t2.temperature 
-- from Weather as t1
-- join Weather as t2
-- where t1.temperature > t2.temperature 
-- and datediff(t1.recordDate, t2.recordDate )=1
-- ;

select t1.id as Id
from Weather as t1
join Weather as t2
where t1.temperature > t2.temperature 
and datediff(t1.recordDate, t2.recordDate )=1
;

