package EmpProject;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		//EmpData ed=new EmpData(1001,"Ram","IT",767878788,300000);
		
		EmpData arr[]=new EmpData[5];
		
		EmpData ed=new EmpData();
		arr[0]=new EmpData(101,"Mk");
	    arr[1]=new EmpData(101,"John");
		arr[2]=new EmpData(102,"Ram");
		
		for(int i=0;i<3;i++) {
			ed.display(arr[i]);
		}
		
		
		System.out.println("-------From Constructor-----");
		System.out.println(ed.age=21);
		System.out.println(ed.exp=2);
		System.out.println(ed.id=1001);
		System.out.println(ed.name="MK");
		System.out.println("-------From Method-----");
		
		
		
		EmpDetails ed1=new EmpDetails();
		ed1.show(ed);
		ed1.details(21, 075656, "Male");
		
		System.out.println("-------Enter Details--------");
		System.out.println("Enter Emp id");
		int eid=scan.nextInt();
		
		System.out.println("Enter Name");
		String ename=scan.next();
		System.out.println("Enter Dept");
		String Dept=scan.next();
		
		EmpData d=new EmpData(eid,ename,Dept);
		
		scan.close();
		
		
		
		

	}

}
