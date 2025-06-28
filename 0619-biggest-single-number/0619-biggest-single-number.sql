SELECT max(num) as num
FROM mynumbers 
where num in(
    select num from mynumbers
GROUP BY num 
Having COUNT(num) =1
)
