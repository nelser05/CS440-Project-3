create view CertainMajor as
	select s.name, m.name
	from STUDENT s, MAJOR m
	where m.id=1
	and s.major=m.id;