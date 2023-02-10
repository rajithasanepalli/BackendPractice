package Switch;

import java.util.Scanner;

public class switch {

	public static void main(String[] args) {
		//create variables
		String gender;
		int age ;
		//using scanner for user input
		Scanner scan=new Scanner(System.in);
		//enter the gender of the person
		System.out.println("enter the value of gender");
		gender=scan.next();
		//enter the age of the person
		System.out.println("enter the value of age");
		age=scan.nextInt();
		//find out if person is eligible for marriage or not using switch case
		switch(gender) {
		case "m":
		case "M":
			if(age>=21) {
			System.out.println("your eligible for marriage");
			}
			System.out.println("your gender is male");
			break;
		case "F":
		case "f":
			if(age>=18) {
				System.out.println("your eligible for marriage");
			}
			System.out.println("your gender is female");
			break;
			// use default case if gender not match with case
		 default:
			System.out.println("your not eligible for marriage");
			break;
		
				
		}


	}

}
