SELECT employee.name, bonus.bonus
FROM employee
LEFT JOIN bonus ON employee.empid = bonus.empid
WHERE bonus.bonus < 1000 OR bonus.bonus IS NULL;
