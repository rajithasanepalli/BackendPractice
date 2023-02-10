
import java.util.Scanner;

public class Timeandwork {

	public static void main(String[] args) {
		int p1, h1, d1, w1, h2, d2, w2, p;
		System.out.println("enter p1,h1,d1,w1,h2,d2,w2");
		Scanner scan = new Scanner(System.in);
		p1 = scan.nextInt();
		h1 = scan.nextInt();
		d1 = scan.nextInt();
		w1 = scan.nextInt();
		h2 = scan.nextInt();
		d2 = scan.nextInt();
		w2 = scan.nextInt();
		p = (p1 * h1 * d1 * w2) / (h2 * d2 * w1);
		System.out.println("no of men " + p);

	}

}
