import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
	int a,b,c;
	System.out.println("Enter two integer values");
	Scanner scan = new Scanner(System.in);
	a= scan.nextInt();
	b= scan.nextInt();
	c=a+b;
	System.out.println("sum of given two number "+c);

	}

}
