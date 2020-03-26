-- check null
select first_name, last_name  --ritorna il first_name e last_name
from employees                -- dalla tabella employees
where commission_pct is null; -- che ha la voce "commission_pct" = a null.

-- null in operations
select first_name, last_name, 12 * salary * commission_pct
from employees;

-- what if null
select first_name, last_name, 12 * salary * ifnull(commission_pct, 0)   ---Se commission_pct è null, moltiplica per zero
from employees;
