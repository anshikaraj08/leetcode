# Write your MySQL query statement below
select v.customer_id, count(*) as count_no_trans
from Visits  v
left join Transactions  t
-- where t.transaction_id is null
on v.visit_id=t.visit_id
where amount is null
group by v.customer_id
;

-- whenever there is a aggregated column like count_no_trans is present. grount the non aggregated column