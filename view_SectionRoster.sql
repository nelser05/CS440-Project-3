create view SectionRoster as
	select s.name
	from STUDENT s, ENROLLMENT e
	where s.id = e.student
	and e.section = 1;