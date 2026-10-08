# Write your MySQL query statement below
select a.user_id, ifnull( round(COUNT(CASE WHEN c.action = 'confirmed' THEN 1 END)
/
COUNT(c.user_id),2),0 )as confirmation_rate 
from Signups a
left join Confirmations c
on a.user_id = c.user_id
group by a.user_id
-- having count(case when c.action='confirmed' then 1 end) 
;