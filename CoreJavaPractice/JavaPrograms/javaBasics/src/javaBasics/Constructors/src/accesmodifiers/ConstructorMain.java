package accesmodifiers;

import java.sql.Date;

import accesmodifiersemp.Employee;

public class ConstructorMain {

	public static void main(String[] args) {
		Project p=new Project (01,"reef",10);
	Report r=new Report(10,"reef","2021-05-12" );
		
		Employee e=new Employee();
		e.EnterEmployeeDetails();
		e.viewEmployeeDetails();
	
		

	}

}
