package com.project.ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserDetails {
	
public static void getUserDetails( ) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("Enter First Name ->");
	String userfirstname= scanner.nextLine();
	
	System.out.println("Enter Last name ->");
	String userlastname= scanner.next();
	
	System.out.println("Enter User Email ->");
	String useremail= scanner.next();
	
	System.out.println("Enter User Phone Number ->");
	long userphonenumber= scanner.nextLong();
	
	System.out.println("Enter User Id ->");
	int userid= scanner.nextInt();
	
	System.out.println("Enter Username ->");
	String username= scanner.next();
	
	System.out.println("Enter Pasword ->");
	String userpassword= scanner.next();
		try {
			Connection connection =Common.getConnection();
			String sql ="insert into user (firstname,lastname,useremail,userphonenumber,userid,username,userpassword)"+"values (?,?,?,?,?,?,?)";
			PreparedStatement prepareStatement =connection.prepareStatement(sql);
			
			prepareStatement.setString(1, userfirstname);
			prepareStatement.setString(2,userlastname);
			prepareStatement.setString(3, useremail);
			prepareStatement.setLong(4,userphonenumber);
			prepareStatement.setInt(5, userid);
			prepareStatement.setString(6, username);
			prepareStatement.setString(7, userpassword);
			
			
			prepareStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Account inserted sucessfully");
	}
	
	
public static void userLogin (){
	
	try {
			Scanner scanner = new Scanner (System.in);
			
			System.out.println("Enter User username ->");
			String uusername= scanner.nextLine();
			
			System.out.println("Enter User Password ->");
			String upassword= scanner.next();
			
			Connection connection =Common.getConnection();
			String sql ="select * from user";
			PreparedStatement prepareStatement =connection.prepareStatement(sql);
					
			ResultSet set= prepareStatement.executeQuery();
			
			while (set.next()) {
				String username = set.getString("username");
				String password= set.getString("userpassword");
				
				if (uusername.equals(username) && upassword.equals(password)) {
					System.out.println("Login Sucessful...");
					//DisplayProduct.displayProductDetails();
					break;
				}
				else {
					System.out.println("Invalid details, Please Enter valid details");
					userLogin();
				}	
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}

public static void main(String[] args) {
	userLogin();
}

}
