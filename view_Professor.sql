create view PROFESSOR as
	select f.name, f.office, l.building, f.department
	from FACULTY f, LOCATION l
	where f.name='Kent Lee'
	and f.office=l.id;