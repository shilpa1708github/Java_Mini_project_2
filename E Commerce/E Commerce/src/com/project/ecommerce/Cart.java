package com.project.ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Cart {

	
public static void getProductDetails() {
	Scanner scanner = new Scanner (System.in);
	System.out.println("Enter product id ->");
	int productid= scanner.nextInt();
	
	System.out.println("Enter product name ->");
	String productname= scanner.next();
	
	System.out.println("Enter product description ->");
	String productdesc= scanner.next();
	
	System.out.println("Enter product price ->");
	int productprice= scanner.nextInt();
	
	System.out.println("Enter product quantity ->");
	int productquantity= scanner.nextInt();
		try {
			Connection connection =Common.getConnection();
			String sql ="insert into cart (productid, productname,productdesc,productprice,productquantity)"+"values (?,?,?,?,?)";
			PreparedStatement prepareStatement =connection.prepareStatement(sql);
			prepareStatement.setInt(2, productid);
			prepareStatement.setString(3, productname);
			prepareStatement.setString(4, productdesc);
			prepareStatement.setInt(5, productprice);
			prepareStatement.setInt(6, productquantity);
			
			prepareStatement.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Prducts details inserted sucessfully");
	}
	
	
public static void main(String[] args) {
	
	
	getProductDetails();
		
}
}
