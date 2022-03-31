package CoreJava;

import java.util.Scanner;

public class Activity {
	public static int loop(int n) 
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		return(fact);
	}
	public static void compare(int a,int b) {
		if(a>b) {
			System.out.println("A is greater "+a);
		}
		else
			System.out.println("B is greater "+b);
		
	}
	
	
	public static void operation(int age)
	{
		if(age>18) {
			System.out.println("The person is eligible to vote");
		}
		else {
			System.out.println("The person is not eligible to vote");
		}
	}
	public static void profile(String name,int age,String dept) {
		System.out.println("NAME :"+name);
		System.out.println("AGE :"+age);
		System.out.println("DEPARTMENT :"+dept);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("-------Parameterized Method-------");
		int n=s.nextInt();
		int res=loop(n);
		
		System.out.println("Factorial is "+res);
		
		System.out.println("-----Vote Eligibility-------");
		
		
		operation(17);
		System.out.println("-------Profile------");
		System.out.println("Enter your Name");
		String name=s.next();
		System.out.println("Enter your Age");
		int age=s.nextInt();
		System.out.println("Enter your dept ");
		String dept=s.next();
		profile(name,age,dept);
		System.out.println("------Opearations-------");
		compare(12,13);
		s.close();
		
		

	}

}
