package CoreJava;

import java.util.Scanner;

class stringprac{
	public void string() {
		StringBuffer sb=new StringBuffer("Hello");
		
		System.out.println(sb.append("Java"));
		sb.reverse();
		System.out.println(sb);
		sb.insert(2,"hey");
		System.out.println(sb);
		sb.delete(1, 3);
		System.out.println(sb);
		
		
	}
	public void str(String a) {
		System.out.println(a.length());
		System.out.println(a.charAt(2));
	}
}

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		stringprac obj=new stringprac();
		obj.string();
		Scanner sc=new Scanner(System.in);
		System.out.println("-----Enter String-----");
		String a=sc.nextLine();
		obj.str(a);
		sc.close();
		
		
		
		
	}
}