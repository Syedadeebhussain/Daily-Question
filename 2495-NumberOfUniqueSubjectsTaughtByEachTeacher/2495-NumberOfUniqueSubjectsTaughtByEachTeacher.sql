-- Last updated: 31/7/2025, 2:22:49 pm
# Write your MySQL query statement below
Select teacher_id,count(distinct(subject_id)) as cnt from Teacher group by teacher_id;