package CoreJava;

import java.util.Scanner;

public class Function {

	public static int add(int a,int b) {
		return (a+b);
		
	}
	public static int sub(int a,int b) {
		return (a-b);
		
	}
	public static int mul(int a,int b) {
		return (a*b);
		
	}
	public static int div(int a,int b) {
		return (a/b);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int add=add(a,b);
		int sub=sub(a,b);
		int mul=mul(a,b);
		int div=div(a,b);
		System.out.println("Addition "+add);
		System.out.println("Subtraction "+sub);
		System.out.println("Multiplication "+mul);
		System.out.println("Division "+div);
		s.close();
	

	}

}
