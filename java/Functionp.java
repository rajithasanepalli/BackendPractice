//program for function with return and with arguments
package functionsp;

import java.util.Scanner;

public class Functionp {
	static int add(int a, int b) {
		return a + b;
		
	}

	public static void main(String[] args) {
		int a, b;
		System.out.println("enter the values of a and b");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		int c= add(a,b);
		
		System.out.println("sum of two given numbers\t" + c);
	}

}
