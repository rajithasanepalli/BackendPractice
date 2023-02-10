import java.util.Scanner;

public class Arithamatic {

	public static void main(String[] args) {
		// create variables
		double a, b;
		// addition
		System.out.println("enter two values of a and b");
		Scanner scan = new Scanner(System.in);
		a = scan.nextDouble();
		b = scan.nextDouble();
		System.out.println("addition of two numbers\t" + (a + b));
		// subtraction
		System.out.println("subtraction of two numbers\t" + (a - b));
		// multiplication
		System.out.println("multiplication of two numbers\t" + (a * b));
		// division
		System.out.println("division of two numbers\t" + (a / b));
		// modulo operation
		System.out.println("modulo operation of two numbers\t" + (a % b));

	}

}
