import java.util.Scanner;

public class Subtraction {	
public static void main(String[]args) {
	int a,b,c;
	System.out.println("Enter two numbers");
	Scanner scan=new Scanner(System.in);
	a=scan.nextInt();
	b=scan.nextInt();
	c=a-b;
	System.out.println("subtraction of two numbers "+c);
}
}
