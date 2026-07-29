# Write your MySQL query statement below

select e.name, b.bonus
from Employee e
LEFT JOIN Bonus b
on e.empID = b.EmpID
where b.bonus < 1000 OR b.bonus is null
