CREATE TRIGGER NewStudent 
after insert on STUDENT 
	begin
		update STUDENT
		set major = null;
	end;