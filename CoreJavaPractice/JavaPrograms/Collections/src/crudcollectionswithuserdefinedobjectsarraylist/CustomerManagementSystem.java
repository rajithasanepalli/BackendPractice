package crudcollectionswithuserdefinedobjectsarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CustomerManagementSystem {
	

	Scanner sc = new Scanner(System.in);
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	Customer c = null;
	public void addCustomer(Customer c) {
		customerList.add(c);
	}
	public void showCustomers() {
		System.out.println("List of customers......");
		for(int i = 0;i<customerList.size();i++) {
				System.out.println(customerList.get(i).getCustomerId()
						+ "\t" + customerList.get(i).getCustomerName()
						+ "\t" + customerList.get(i).getCustomerEmail()
						+ "\t" + customerList.get(i).getCustomerPhone());
		}
	}
	public Customer readCustomerDetails(Customer c) {
		
		System.out.println("Enter the Customer details");
		System.out.println("Enter the customer id");
		sc.nextLine();
		c.setCustomerId(sc.nextLine());
		System.out.println("Enter the customer name");
		c.setCustomerName(sc.nextLine());
		System.out.println("Enter the customer email");
		c.setCustomerEmail(sc.nextLine());
		System.out.println("Enter the customer phone");
		c.setCustomerPhone(sc.nextInt());
		return c;
		
	}
	
	public Customer findCustomerById(String cid) {
		Customer c12 = new Customer();
		for(int i = 0;i<customerList.size();i++) {
			if((customerList.get(i).getCustomerId().equals(cid))) {
				c12 = customerList.get(i);
			}
		}
		return c12;
		
	}
	
	public String removeCustomer(Customer cr) {
		if(customerList.remove(cr)) {
			return "customer removed successfully";
		}else {
			return "no customer found to remove";
		}
	}
	
	public void sortCustomersByName() {
		Collections.sort(customerList,new CustomerNameComparator());
		System.out.println("List of Customers......");
		for(int i = 0;i<customerList.size();i++) {
				System.out.println(customerList.get(i).getCustomerId()
						+ "\t" + customerList.get(i).getCustomerName()
						+ "\t" + customerList.get(i).getCustomerEmail()
						+ "\t" + customerList.get(i).getCustomerPhone());
		}
	}
	
	public void sortCustomersById() {
		Collections.sort(customerList,new CustomerNameComparator());
		System.out.println("List of Customers......");
		for(int i = 0;i<customerList.size();i++) {
				System.out.println(customerList.get(i).getCustomerId()
						+ "\t" + customerList.get(i).getCustomerName()
						+ "\t" + customerList.get(i).getCustomerEmail()
						+ "\t" + customerList.get(i).getCustomerPhone());
		}
	}
	
	public void showCustomerOperations() {
		char ch = 'y';
		while (ch=='y') {
			
			System.out.println("Enter the Operation name to execute .....");
			System.out.println("1.to add customer");
			System.out.println("2.list all customers");
			System.out.println("3.to delete the customer");
			System.out.println("4.to update customer");
			System.out.println("5.to sort customers by name");
			System.out.println("6.to sort customers by id");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				c = new Customer();
				addCustomer(readCustomerDetails(c));
				break;
			case 2:
				showCustomers();
				break;
			case 3:
				System.out.println("Enter the customer id to remove...");
				String cid = sc.next();
				Customer c1 = findCustomerById(cid);
				System.out.println(removeCustomer(c1));
				break;
			case 5:
				sortCustomersByName();
				break;
				
			case 6:
				sortCustomersById();
				break;

			default:
				break;
			}
			
			System.out.println("do you want to continue....");
			ch = sc.next().charAt(0);
		}
	}
	

}
