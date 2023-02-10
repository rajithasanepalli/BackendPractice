package oopsconcept;

import java.util.Scanner;

public class Rectangle extends Shape {
	
double width;
double length;
public void rectangle() {
	  
	      System.out.println("Enter  width");
			width = sc.nextDouble();
			System.out.println("Enter length");
			length = sc.nextDouble();
			double area=length*width;
			System.out.println("Area of rectangle="+area);
			

}
}
