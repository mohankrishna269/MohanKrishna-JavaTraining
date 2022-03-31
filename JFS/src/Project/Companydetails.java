package Project;
import java.util.Scanner;

public class Companydetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		
        System.out.println("Enter Employee Id:");
        int emp_id=scan.nextInt();
        System.out.println("Enter Salary:");
        int salary=scan.nextInt();
        System.out.println("Enter Name:");
        String name=scan.next();
        System.out.println("Enter address:");
        String address=scan.next();
        System.out.println("Enter Department:");
        String department=scan.next();
        System.out.println("Enter Emailid:");
        String email=scan.next();
        
        EmployeeDetails emp=new EmployeeDetails(emp_id,salary,name,address,department,email);
        
        
        
        
          
        
        System.out.println(emp);  
          
        
        int sal = emp.getSalary();  
        int increment = 0;  
          
        if ((sal >=10000) && (sal <=15000))  
        {  
             
            increment += (sal * 2)/100;  
            sal = sal+increment;  
              
            emp.setSalary(sal);  
            System.out.println("\n Salary is incremented \n");  
            System.out.println(emp);  
              
        }else if ((sal >=15000) && (sal <=30000)){  
          
            increment += (sal * 5)/100;  
            sal = sal+increment;  
              
            emp.setSalary(sal);  
            System.out.println("\n Salary is incremented \n");  
            System.out.println(emp);  
        }else {  
            System.out.println("\n Salary is not incremented \n");  
            System.out.println(emp); 
            scan.close();
        }         
    }  }


