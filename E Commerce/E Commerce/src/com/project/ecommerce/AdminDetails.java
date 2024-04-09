package com.project.ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminDetails {

public static void adminLogin (){
	
	try {
			Scanner scanner = new Scanner (System.in);
			
			System.out.println("Enter Admin username ->");
			String ausername= scanner.nextLine();
			
			System.out.println("Enter Admin Password ->");
			String apassword= scanner.next();
			Connection connection =Common.getConnection();
			String sql ="select * from admin";
			PreparedStatement prepareStatement =connection.prepareStatement(sql);
					
			ResultSet set= prepareStatement.executeQuery();
			
			while (set.next()) {
				String adminusername = set.getString("adminusername");
				String adminpassword= set.getString("adminpassword");
				
				if (ausername.equals(adminusername) && apassword.equals(adminpassword)) {
					System.out.println("Login Sucessful...");
					//DisplayProduct.displayProductDetails();
					break;
				}
				else {
					System.out.println("Invalid details, Please Enter valid details");
					adminLogin();
				}	
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}


	
}
