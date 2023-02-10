public class Bitwise {

	public static void main(String[] args) {
		// integer bitwise logical operator
		int a = 6; // binary form 110
		int b = 4; // binary form 100
		System.out.println("a&b= " + (a & b));
		System.out.println("a|b= " + (a | b));
		System.out.println("a^b= " + (a ^ b));
		System.out.println(" ~a="+(~a));
		// boolean logical operator
		boolean boolean1 = true;
		boolean boolean2 = false;
		// boolean and
		System.out.println("boolean1&boolean2= " + (boolean1 & boolean2));
		System.out.println("boolean2&boolean1= " + (boolean2 & boolean1));
		System.out.println("boolean2&boolean2= " + (boolean2 & boolean2));
		System.out.println("boolean1&boolean1= " + (boolean1 & boolean1));
		// boolean or
		System.out.println("boolean1|boolean2= " + (boolean1 | boolean2));
		System.out.println("boolean2|boolean1= " + (boolean2 | boolean1));
		System.out.println("boolean2|boolean2= " + (boolean2 | boolean2));
		System.out.println("boolean1|boolean1= " + (boolean1 | boolean1));
		// boolean xor
		System.out.println("boolean1^boolean2= " + (boolean1 ^ boolean2));
		System.out.println("boolean2^boolean1= " + (boolean2 ^ boolean1));
		System.out.println("boolean2^boolean2= " + (boolean2 ^ boolean2));
		System.out.println("boolean1^boolean1= " + (boolean1 ^ boolean1));
		// boolean not
		System.out.println("!boolean1= " + !boolean1);
		//bitwise shifts
		System.out.println("(a>>2)\t "+(a>>2)); 
		System.out.println("(a<<4)\t "+(a<<4)); 
		System.out.println("(b>>1)\t "+(b>>1)); 
		System.out.println("(b<<2)\t "+(b<<2)); 

	}
}
