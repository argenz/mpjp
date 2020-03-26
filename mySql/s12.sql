-- that one
select *              -- righe o colonne? 
from regions          -- table name
where region_id = 1;  -- colonne

-- the other ones
select *
from regions
where region_id != 2;

-- strictly less than
select *
from regions
where region_id < 3;

-- less or equal to
select *
from regions
where region_id <= 3;

-- less or equal to
select *
from regions
where region_name <= "Europe";  -- guarda l'ordine alfabetico
