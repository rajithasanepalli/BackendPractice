package javaBasics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int n;
		int reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		n=sc.nextInt();
		while(n!=0) {
			int remainder=n%10;
			reverse=(reverse*10)+remainder;
			n=n/10;
			
			
		}
		System.out.println("Reverse Number="+reverse);
		

	}

}
