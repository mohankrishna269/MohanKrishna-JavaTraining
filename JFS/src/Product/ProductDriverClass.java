package Product;
import java.sql.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ProductDriverClass {
	public static void main(String args[]) throws SQLException {
		Scanner scan=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/product";
		String username="root";
		String password="Root";
		String query="select * from product_details";
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		System.out.println("**********Welcome to Online Shopping**********");
		System.out.println("======Product Details========");
		System.out.println("Product_id\t"+"Product_Name\t"+"Product_Price\t"+"Product_color\t");
		String name,color;
		int id;
		float price;
		while(rs.next()) {
			 id=rs.getInt("product_id");
			 name=rs.getString("product_name");
			 price=rs.getFloat("product_price");
			 color=rs.getString("product_color");
			 
			 System.out.println(id+"\t\t"+name+"\t\t"+price+"\t\t"+color);
			
			}
		st.close();
		con.close();
		
		
		List<ProductBasicinfo> prod=new ArrayList<ProductBasicinfo>();
		System.out.println("How many Products Do you want to Buy!!!Max:3");
		System.out.println("1. One Product");
		System.out.println("2. TwoProducts");
		System.out.println("3. Three Products");
		OnlineShopping os=new OnlineShopping();
		
		int choice=scan.nextInt();
		
		switch(choice) {
		case 1:{
		for(int i=0;i<1;i++) {
			System.out.println("Enter ProductId: ");  
			int product_id=scan.nextInt();
			System.out.println("Enter ProductName: ");
			String product_name=scan.next();
			System.out.println("Enter Product Price: ");
			float product_price=scan.nextFloat();
			System.out.println("Enter Product Color: ");
			String product_color=scan.next();
			prod.add(new ProductBasicinfo (product_id,product_name,product_price,product_color));}
		for(ProductBasicinfo i:prod) {
		System.out.println("Product Id:"+i.product_id);
		for(ProductBasicinfo j:prod) {
			os.discount(j);
			os.color(j);
			os.payment();
			}
		}
		break;}
		
		case 2:
		{
			for(int i=0;i<2;i++) {
				System.out.println("Enter ProductId: ");  
				int product_id=scan.nextInt();
				System.out.println("Enter ProductName: ");
				String product_name=scan.next();
				System.out.println("Enter Product Price: ");
				float product_price=scan.nextFloat();
				System.out.println("Enter Product Color: ");
				String product_color=scan.next();
				prod.add(new ProductBasicinfo (product_id,product_name,product_price,product_color));}
			for(ProductBasicinfo i:prod) {
			System.out.println("Product Id:"+i.product_id);
		}
			for(ProductBasicinfo i:prod) {
				os.discount(i);
				os.color(i);
				}
			os.payment();
			break;
		}
	
		case 3:{
			for(int i=0;i<3;i++) {
				System.out.println("Enter ProductId: ");  
				int product_id=scan.nextInt();
				System.out.println("Enter ProductName: ");
				String product_name=scan.next();
				System.out.println("Enter Product Price: ");
				float product_price=scan.nextFloat();
				System.out.println("Enter Product Color: ");
				String product_color=scan.next();
				prod.add(new ProductBasicinfo (product_id,product_name,product_price,product_color));}
			for(ProductBasicinfo i:prod) {
			System.out.println("Product Id:"+i.product_id);
		}
			for(ProductBasicinfo i:prod) {
				os.discount(i);
				os.color(i);
				}
			os.payment();
			break;
		}
		}
	
		
		
		
			
		
		
		
//		for(ProductBasicinfo i:prod) {
//			os.discount(i);
//			os.color(i);
//			os.payment(i);
//		}
		scan.close();
		
		//System.out.println(obj);
		}
	
	}
		
		
		
		 
		
		
	



