package JDBC;
import java.util.*;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCMethodClass {
	public static PreparedStatement pst;
	
	public void insert() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		char ch;
//		int id;
//		String name;
//		String dept;
//		float salary;
//	     
		
		//int rows_affected_pst;
	
		
//			System.out.println("Enter the Id:");
//			id=scan.nextInt();
//			System.out.println("Enter the Name:");
//			name=scan.next();
//			System.out.println("Enter the Department:");
//			dept=scan.next();
//			System.out.println("Enter the salary:");
//			salary=scan.nextFloat();
//			System.out.println("Want to add more data  Y or N");
			//ch=scan.next().charAt(0);
		//}while(ch=='Y'||ch=='y');
//			this.id=id;
//			this.name=name;
//			this.dept=dept;
//			this.salary=salary;
		do {
		   System.out.println("Enter the Id:");
			pst.setInt(1,scanner.nextInt());
			System.out.println("Enter the Name:");
			pst.setString(2,scanner.next());
			System.out.println("Enter the Department:");
		    pst.setString(3,scanner.next());
		    System.out.println("Enter the salary:");
			pst.setFloat(4,scanner.nextFloat());
			System.out.println("Want to add more data  Y or N");
			ch=scanner.next().charAt(0);
			//rows_affected_pst=pst.executeUpdate();
			
			
	}while(ch=='Y'||ch=='y');
		scanner.close();
	}
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		JDBCMethodClass obj=new JDBCMethodClass();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "Root");
		Statement st=con.createStatement();
		String query="insert into empdetails(eid,ename,edept,salary) values(?,?,?,?)";
		
		pst=con.prepareStatement(query);
		obj.insert();
		int rows_affected_pst=pst.executeUpdate();
		ResultSet rs=st.executeQuery("select * from empdetails");
		while(rs.next()) {
			System.out.println(rs.getInt("eid")+"\t\t"+rs.getString("ename")+"\t\t"+rs.getString("edept")+"\t\t"+rs.getFloat("salary"));
			
		}
		rs.close();
		st.close();
		
		
		

	}

}
