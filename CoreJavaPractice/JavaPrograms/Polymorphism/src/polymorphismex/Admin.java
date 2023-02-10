package polymorphismex;

public class Admin extends PayRoll {
	String adminname="Rajitha";
	int adminsal=20000;
	
public void adminDetails() {
	System.out.println("admin name="+adminname);
	System.out.println("admin sal="+adminsal);
		
	}

public void adminDetails(String adminname,int adminsal) {
	this.adminname=adminname;
	this.adminsal=adminsal;
	System.out.println("admin name="+adminname);
	System.out.println("admin sal="+adminsal);
	
}
	public void adjustSalary() {
		System.out.println("Adjust salary Of Admin is 25000");
	}
	

}
