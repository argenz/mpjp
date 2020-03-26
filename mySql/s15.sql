-- sorting in natural order
select *
from employees
where first_name like "A%"
order by last_name;  -- ordinato per last name

-- ascending, descending
select *
from employees
order by last_name desc, first_name asc;

-- positional notation
select first_name, last_name
from employees
order by 2;    -- Last name, by 2, cioè il secondo indice del select.
