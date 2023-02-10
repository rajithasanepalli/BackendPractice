public class Logical {

	public static void main(String[] args) {
		// create variables
		int a = 6, b = 4;
		// logical and
		System.out.println((a >= b) + "\t" + (a == b) + "\t" + ((a >= b) && (a == b)));
		System.out.println((a < b) + "\t" + (b > a) + "\t" + ((a < b) && (b > a)));
		System.out.println((b >= a) + "\t" + (b > a) + "\t" + ((b >= a) && (b > a)));
		System.out.println((a != b) + "\t" + (a >= b) + "\t" + ((a != b) && (a >= b)));
		// logical or
		System.out.println((a >= b) + "\t" + (a == b) + "\t" + ((a >= b) || (a == b)));
		System.out.println((a < b) + "\t" + (b > a) + "\t" + ((a < b) || (b > a)));
		System.out.println((b >= a) + "\t" + (b > a) + "\t" + ((b >= a) || (b > a)));
		System.out.println((a != b) + "\t" + (a >= b) + "\t" + ((a != b) || (a >= b)));
		// logical not
		System.out.println((a != b) + "\t" + (!(a != b)));
		System.out.println((a <= b) + "\t" + (!(a <= b)));

	}

}