public class Conditional {

	public static void main(String[] args) {
		// create variables
		int a=6,b=4,c;
		c=(a<b)? a:b;
		System.out.println("if a is less than b then c= \t"+(c));
		c=(a>b)? a:b;
		System.out.println("if a is greater than b then c= \t"+(c));
		c=(a>=b)? a:b;
		System.out.println("if a is greater than or equal to b then c= \t"+(c));
		c=(a<=b)? a:b;
		System.out.println("if a is less than or equal to b then c= \t"+(c));
		c=(a!=b)? a:b;
		System.out.println("if a is not equal to b then c= \t"+(c));
	}
}
		
		
		