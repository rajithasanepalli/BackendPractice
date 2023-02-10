package oopsconcept;

public class Square  extends Rectangle{
	
		public void square() {
			 System.out.println("Enter  width");
				width = sc.nextDouble();
				System.out.println("Enter length");
				length = sc.nextDouble();
			double area=length*width;
			
		      System.out.println("Area of square="+area);
		   }



}
