package javaBasics;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int n;
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of elements we want to store:");
	
		n=sc.nextInt();
		int arr[]=new int[10];
		System.out.println("Enter Array Elements:");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
			System.out.println("Array Elements are:");
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]);
			}
			System.out.println("\n");
			System.out.println("Reverse Array Elements are:");
			for(int i=arr.length-1;i>=0;i--) {
				System.out.println(arr[i]);
				
			}
			
	
			
		}
	
		
		

	}


