package com.project.ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {

	public static void getAdminDetails (){

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter Admin Id ->");
		int adminid= scanner.nextInt();
		
			try {
				Connection connection =Common.getConnection();
			String sql ="select from admin where adminid=?";
				PreparedStatement prepareStatement =connection.prepareStatement(sql);
			
				prepareStatement.setInt(1,adminid);
				
				ResultSet set = prepareStatement.executeQuery();
				
				while (set.next()) {
				set.getString(2);
				set.getString(4);
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Admin Login sucessfully");
		}
	
	public static void main(String[] args) {
		getAdminDetails();
	}
}
