# Write your MySQL query statement below
select name, population , area
from World
where area>=3*1e6 or population>=25e6;