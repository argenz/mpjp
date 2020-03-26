-- simple pattern matching
select last_name
from employees
where last_name like '_ul%';  -- un carattere + ul + qualunque carattere.
--vale anche con la negazione not like

-- interval check
select *
from regions
where region_id between 2 and 3;   -- tra 2 che 3 inclusivi

select *
from countries
where country_name between 'a' and 'c';  -- in ordine alfabetico // China non è visibile perchè "china" è dopo "c" in ordine alfabetico.
-- Basato sulla tabella UTF-8/ASCII:

-- check if (not) in a set
select *
from regions
where region_id not in (2, 3);  -- non sono estremi, sono solo casi puntuali che deve controllare. (2,4,3)


-- beware of null
select *
from regions
where region_id not in (2, 3, null);  -- null non mi da risultato acettabile.

-- can't compare a 'good' value with null
select *
from regions
where region_id not in (null) or region_id in (null);   --confronto con il null da pasticci così, usa la funzione isnull

-- this works fine
select *
from employees
where commission_pct in (0.10);

-- this does not select anything!
select *
from employees
where commission_pct in (null);

-- "is null" is the only way to check it
select *
from employees
where commission_pct is null;
