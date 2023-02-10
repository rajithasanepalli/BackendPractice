package polymorphismex;

public class Academic extends PayRoll{
	String academicname="pinki";
	int academicsal=50000;
	
public void academicDetails() {
	System.out.println("academic name="+academicname);
	System.out.println("academic  sal="+academicsal);
		
	}
	public void adjustSalary() {
		System.out.println("Adjust salary Of Academic is 25000");
	}
	
}
