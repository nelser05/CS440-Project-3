CREATE TRIGGER NewEnrollGrad 
after insert on ENROLLMENT 
for each row  
begin 
	update ENROLLMENT set grade = null; 
end;