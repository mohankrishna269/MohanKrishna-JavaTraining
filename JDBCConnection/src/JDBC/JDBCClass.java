package JDBC;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class JDBCClass {

	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/employee";
		String username="root";
		String password="Root";
		String query="select * from empdetails";
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		String name,dept;
		int id;
		float salary;
		Date d;
		Time t;
		
		
		while(rs.next()) {
		 id=rs.getInt("eid");
		 name=rs.getString("ename");
		 dept=rs.getString("edept");
		 salary=rs.getFloat("salary");
		 d=rs.getDate("joineddate");
		 t=rs.getTime("joinedtime");
		 System.out.println(id+"   "+name+"   "+dept+"   "+salary+"   "+d+"   "+t);
		
		}
		st.close();
		con.close();

	}

}
