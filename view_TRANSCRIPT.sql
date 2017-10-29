create view TRANSCRIPT as
  select s.name, c.title, k.instructor, k.offered, e.grade
  from ENROLLMENT e, SECTION k, COURSE c, STUDENT s
  where e.section=k.id
  and s.id=e.student
  and k.course=c.id
  and e.student=1;