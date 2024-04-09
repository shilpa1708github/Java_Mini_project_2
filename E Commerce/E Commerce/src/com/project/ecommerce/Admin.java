package com.project.ecommerce;

import java.util.Scanner;

public class Admin {

	public static void getAdminChoice () {
		System.out.println("Press 1 -  Admin Login \n Press 2-  Add Product Items \n Press 3  Calculate Bill"
				+ "\n Press 4 - Display amount to end user \n Press 5 - Check Quantity \n Press 6 - Check "
				+ "registered user"
				+ " \n Press 7 - Check Particular user history");
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter your Choice");
		int choice = scanner.nextInt();
		switch (choice) {
		
		case 1:
			System.out.println("---------Admin Login -----------");
				AdminDetails.adminLogin();
			break;
			
		case 2:
			System.out.println("---------Add Product Items -----------");
			
			
		case 3 : 
			System.out.println("---------Calculate Bill -----------");
			DisplayProduct.displayProductDetails();
			break;
			
		case 4:
			System.out.println("---------Display amount to end user -----------");
			
		case 5:
			System.out.println("---------Check quantity  -----------");
			
		case 6:
			System.out.println("---------Check registered user  -----------");
			
		case 7:
			System.out.println("---------Check particular user history -----------");
			
		default :
			System.out.println("Invalid Choice");
			
		}
	}
}
