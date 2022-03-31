package EmpProject;
import java.util.Scanner;
public class EmpData {
	Scanner s=new Scanner(System.in);
	Integer eid;
	String ename;
	String dep;
	long phnno;
	float salary;
	Integer age;
	int exp;
	int id;
	String name;
	public EmpData() {
		
	}
	
	
	public EmpData(int eid,String name,String dept) {
		
		this.id=eid;
		this.ename=name;
		this.dep=dept;
		
		System.out.println("ID:"+eid);
		System.out.println("Name:"+name);
		System.out.println("Department:"+dept);
		
		
		
	}
	public EmpData(int age,int experience) {
		this.age=age;
		this.exp=experience;
	}
	public EmpData(int id,String name) {
		this.id=id;
		this.name=name;
	}
		public void display(EmpData ed) {
			System.out.println(ed.id);
			System.out.println(ed.name);
			
			
		}
		


		
	
	
	}
	


