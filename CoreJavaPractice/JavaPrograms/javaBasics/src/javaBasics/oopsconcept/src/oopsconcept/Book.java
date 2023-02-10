package oopsconcept;

import java.util.Scanner;

public class Book {
	
	

	//following are the instance variables of Book(Attributes)
	String isbnNo;
	String bookName;
	float bookPrice;
	int no_Of_Pages;
	String publishedDate;
	
	Scanner sc = new Scanner(System.in);
	public void readBookDetails() {
		
		System.out.println("Enter the Book Details");
		System.out.println("Enter the Book ISBN number");
		isbnNo = sc.next();
		System.out.println("Enter the Book Name");
		sc.nextLine();
		bookName = sc.nextLine();
		System.out.println("Enter the Book Price");
		bookPrice = sc.nextFloat();
		System.out.println("Enter the no_Of_Pages");
		no_Of_Pages = sc.nextInt();
		System.out.println("Enter the Book Published Date");
		publishedDate = sc.next();
	}
	
	public void displyBookDetails() {
		
		System.out.println("The Book Details");
		System.out.println("Book ISBN number = " + isbnNo);
		 
		System.out.println("Book Name = "+bookName);
		
		System.out.println("Book Price = "+bookPrice);
		
		System.out.println("no_Of_Pages = "+no_Of_Pages);
		
		System.out.println("Published Date = " +publishedDate);
		
	}


}
