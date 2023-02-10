package Primecount;

import java.util.Scanner;

public class Primecount {

	public static void main(String[] args) {
		// Creating variables
		int a,b;
		//Initializing count value for counting number of factors
		int count=0, primeCount=0;
		//Using Scanner for user input
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the values from range a");
		a=scan.nextInt();
		System.out.println("enter the values to rane b");
		b=scan.nextInt();
		//Using while loop for print count value of prime numbers
		int i=a;
		while(i<=b) {
			count=0;
			int j=1;
			while(j<=i)
			{
				if(i%j==0) {
					count=count+1;//counting number of factors
				}
				j++;
			}
			if(count==2) {
				primeCount=primeCount+1;//counting how many prime numbers are coming
				//System.out.println(i);
			}
			i++;

		}
		
		System.out.println("enter the count values of prime number are:"+primeCount);

	}
	

}

