package oopsconcept;

import java.util.Scanner;

public class Circle extends Shape {
double radius;
double circuimference;
double Area;
	
	public void circle() {
	      System.out.println("Enter the Circle details");
	      System.out.println("Enter circle radius");
			radius = sc.nextDouble();
			circuimference=2*(22/7)*radius;
			Area=(22/7)*(radius*radius);
			radius=(circuimference/2*(22/7));
			System.out.println("circuimference of Circle="+circuimference);
			System.out.println("Radius of circle="+radius);
			System.out.println("Area of circle="+Area);


	}
}
