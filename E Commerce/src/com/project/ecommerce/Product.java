package com.project.ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Product {

	public static void getProductDetails(int productid,String productname, String productdesc, int productprice, int productquantity) {
		
		try {
			Connection connection =Common.getConnection();
			String sql ="insert into product (productid, productname,productdesc,productprice,productquantity)"+"values (?,?,?,?,?)";
			PreparedStatement prepareStatement =connection.prepareStatement(sql);
			prepareStatement.setInt(1, productid);
			prepareStatement.setString(2, productname);
			prepareStatement.setString(3, productdesc);
			prepareStatement.setInt(4, productprice);
			prepareStatement.setInt(5, productquantity);
			
			prepareStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Prducts details inserted sucessfully");
	}
	
	
public static void main(String[] args) {
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
	
	getProductDetails(productid, productname, productdesc, productprice, productquantity);
		
}
}
