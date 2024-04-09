package com.project.ecommerce;

import java.util.Scanner;

public class User {

	public static void getUserChoice () {
		System.out.println("Press 1 - New Registration \n Press 2- For User Login \n Press 3 For User View Product Item as Sorted Order"
				+ "\n Press 4 - For Buy Product \n Press 5 - View Cart \n Press 6 - Purchase the Items ");
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter your Choice");
		int choice = scanner.nextInt();
		switch (choice) {
		
		case 1:
			System.out.println("---------User Registration Page -----------");
				UserDetails.getUserDetails();
			break;
			
		case 2:
			System.out.println("---------User Login Page -----------");
				UserDetails.userLogin();
			
		case 3 : 
			System.out.println("---------User View Product Item as Sorted Order -----------");
			DisplayProduct.displayProductDetails();
			break;
			
		case 4:
			System.out.println("---------Buy Products  -----------");
			
		case 5:
			System.out.println("---------View Cart  -----------");
			
		case 6:
			System.out.println("---------Purchase the Items  -----------");
			
		default :
			System.out.println("Invalid Choice");
			
		}
	}
}
