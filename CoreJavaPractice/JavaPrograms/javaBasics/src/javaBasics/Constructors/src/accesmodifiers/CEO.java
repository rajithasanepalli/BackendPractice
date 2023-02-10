package accesmodifiers;

import java.util.Scanner;

public class CEO {
	public String ceo_email;
	private String ceo_password;
	Scanner sc=new Scanner(System.in);

	
	protected CEO(){
		System.out.println("Enter CEO email");
		ceo_email=sc.next();
		System.out.println("Enter CEO password");
		ceo_password=sc.next();
		
	}
	public String getCeo_email() {
		return ceo_email;
	}
	public void setCeo_email(String ceo_email) {
		this.ceo_email = ceo_email;
	}
	public String getCeo_password() {
		return ceo_password;
	}
	public void setCeo_password(String ceo_password) {
		this.ceo_password = ceo_password;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public void viewCeoDetails() {
		System.out.println("CEO email="+ceo_email);
		System.out.println("CEO password="+ceo_password);
	}
	
	

}
