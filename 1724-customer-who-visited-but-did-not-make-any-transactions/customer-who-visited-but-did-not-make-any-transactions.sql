# Write your MySQL query statement below
-- select v.customer_id, count(v.visit_id)
-- from Visits v
-- right join Transactions t
-- on v.visit_id=t.visit_id
-- group by v.customer_id;

select customer_id, count(visit_id) as count_no_trans
from Visits where visit_id not in
(select visit_id from Transactions)
GROUP BY customer_id;;
