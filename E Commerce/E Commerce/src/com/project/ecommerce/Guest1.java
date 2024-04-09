package com.project.ecommerce;

import java.util.Scanner;

public class Guest1 {

	
	public static void getGuestChoice () {
		System.out.println("Press 1 -  View Product Items \n Press 2-  Not Purchase Items \n");
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter your Choice");
		int choice = scanner.nextInt();
		switch (choice) {
		
		case 1:
			System.out.println("---------View Product Items -----------");
				DisplayProduct.displayProductDetails();
			break;
			
		case 2:
			//System.out.println("---------Not Purchase Items -----------");
				throw new GuestCustomException("Please Login before place order");
			
		default : 
			System.out.println("Invalid Choice");
		
			
}
}}