package polymorphismex;

public class PolymorphismMain {

	public static void main(String[] args) {
		PayRoll p=new PayRoll();
		
		Admin a=new Admin();
		Academic ac=new Academic();
		a.adminDetails();
		a.adminDetails("Lalitha",30000);
		ac. academicDetails();
		p.adjustSalary();
		a.adjustSalary();
		ac.adjustSalary();
	}

}
