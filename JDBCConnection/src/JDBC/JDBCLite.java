package JDBC;
import java.sql.*;
import java.util.*;

public class JDBCLite {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "Root");
		Statement st=con.createStatement();
		String query="insert into empdetails(eid,ename,edept,salary) values(?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		Scanner scan=new Scanner(System.in);
      	char ch;
		int rows_affected_pst;
		do { 
		System.out.println("Enter the Id:");
		int id=scan.nextInt();
		System.out.println("Enter the Name:");
		String name=scan.next();
		System.out.println("Enter the Department:");
		String dept=scan.next();
		System.out.println("Enter the salary:");
		float salary=scan.nextFloat();
		System.out.println("Want to add more data  Y or N");
		ch=scan.next().charAt(0);
		
	
		pst.setInt(1, id);
		pst.setString(2,name);
		pst.setString(3, dept);
		pst.setFloat(4, salary);
		rows_affected_pst=pst.executeUpdate();
		//rows_affected_pst++;
		}while(ch == 'Y' || ch == 'y');
	
	
		//int rows_affected=st.executeUpdate("insert into empdetails(eid,ename,edept,salary) values(11,'Mano','Mech',60000)");
		
		
		
		
		ResultSet rs=st.executeQuery("select * from empdetails");
		while(rs.next()) {
      	   System.out.println(rs.getInt("eid")+"\t\t"+rs.getString("ename")+"\t\t"+rs.getString("edept")+"\t\t"+rs.getFloat("salary"));
			
		}
		rs.close();
		
		String query2="update empdetails set edept=? where eid=?";
		pst=con.prepareStatement(query2);
		System.out.println("Enter the Department to Update:");
		pst.setString(1,scan.next());
		System.out.println("Enter the ID:");
		pst.setInt(2,scan.nextInt());
		
		int rows_updated=pst.executeUpdate();
		ResultSet rs1=st.executeQuery("select * from empdetails");
		while(rs1.next()) {
			System.out.println(rs1.getInt("eid")+"\t\t"+rs1.getString("ename")+"\t\t"+rs1.getString("edept")+"\t\t"+rs1.getFloat("salary"));
			
		}
		rs1.close();
		String query3="delete from empdetails where eid=?";
		pst=con.prepareStatement(query3);
		System.out.println("Enter the ID to delete:");
		pst.setInt(1,scan.nextInt());
		
		int rows_deleted=pst.executeUpdate();
		ResultSet rs2=st.executeQuery("select * from empdetails");
		while(rs2.next()) {
			System.out.println(rs2.getInt("eid")+"\t\t"+rs2.getString("ename")+"\t\t"+rs2.getString("edept")+"\t\t"+rs2.getFloat("salary"));
			
		}
		rs2.close();
		
		
		st.close();
		scan.close();
		
		
		

	}

}

