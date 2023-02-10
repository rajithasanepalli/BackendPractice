package javaBasics;

import java.util.Scanner;

public class Factrorial {

	public static void main(String[] args) {
		double fact=1;
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial of number="+fact);
	

	}

}
