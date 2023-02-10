package oopsconcept;

import java.util.Scanner;

public class BookManagement {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		// create a book object
		Book b = new Book();
		char ch = 'y';// local variable because it is defined inside main method

		while (ch == 'y') {
			System.out.println("Enter the Transaction.....");
			System.out.println("Enter 'read' to enter book details.....");
			System.out.println("Enter 'display' to view book details.....");
			String transaction = sc.next();

			switch (transaction) {
			case "read":
				b.readBookDetails();
				break;
			case "display":
				b.displyBookDetails();
				break;
			default:
				System.out.println("Wrong choice....");
				break;
			}// close of switch
			System.out.println("Enter the choice to continue.....");
			ch = sc.next().charAt(0);
		} // close of while


	}

}
