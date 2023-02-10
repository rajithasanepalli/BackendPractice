public class Operators2 {

	public static void main(String[] args) {
		// create variables
		int a = 15, b = 10, c;
		// < operator
		c = (a < b) ? a : b;
		System.out.println("if a is less than b\t" + (c));
		// > operator
		c = (a > b) ? a : b;
		System.out.println("if a is greater than b\t" + (c));
		// == operator
		c = (a == b) ? a : b;
		System.out.println("if a is equal to b\t" + (c));
		// != operator
		c = (a != b) ? a : b;
		System.out.println("if a not equalto b\t" + (c));
		// >= operator
		c = (a >= b) ? a : b;
		System.out.println("if a is greater than or equal to b\t" + (c));
		// <= operator
		c = (a <= b) ? a : b;
		System.out.println("if a less than or eqal to b\t" + (c));
	}
}

