import java.util.Scanner;

public class Simpleintrest {
	public static void main(String[] args) {
		double p, t, r, si;
		System.out.println("enter principle,rate of intrest and time");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of principle");
		p = scan.nextDouble();
		System.out.println("enter the value of time ");
		t = scan.nextDouble();
		System.out.println("enter the value of rate of intrest");
		r = scan.nextDouble();
		si = (p * t * r) / 100;
		System.out.println("simple intrest " + si);
	}
}
