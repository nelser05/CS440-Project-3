create view StudentSemester as
	select s.name, k.course, j.year, j.season
	from STUDENT s, SECTION k, ENROLLMENT e, SEMESTER j
	where s.id=1
	and k.id=e.section
	and e.student=s.id
	and j.id=k.offered;