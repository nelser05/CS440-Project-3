CREATE TRIGGER NewFaculty 
after insert on FACULTY 
	begin
		update FACULTY
		set endDate = null;
	end;