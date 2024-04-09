package com.project.ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminDetails {

public static void getAdminDetails(String adminname, String adminemail,String adminpassword, long adminphonenumber ){
		
		try {
			Connection connection =Common.getConnection();
		String sql ="insert into admin (adminname,adminemail,adminpassword, adminphonenumber)"+"values (?,?,?,?)";
			PreparedStatement prepareStatement =connection.prepareStatement(sql);
		
			prepareStatement.setString(1,adminname);
			prepareStatement.setString(2, adminemail);
			prepareStatement.setString(3, adminpassword);
			prepareStatement.setLong(4, adminphonenumber);
			
			
			prepareStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Admin details inserted sucessfully");
	}
	
	
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Enter Admin name ->");
	String adminname= scanner.nextLine();
	
	System.out.println("Enter Admin email ->");
	String adminemail= scanner.next();
	
	System.out.println("Enter Admin Password ->");
	String adminpassword= scanner.next();
	
	System.out.println("Enter Admin Phone Number ->");
	Long adminphonenumber= scanner.nextLong();
	
	getAdminDetails(adminname, adminemail, adminpassword, adminphonenumber);
	

		
}
}
