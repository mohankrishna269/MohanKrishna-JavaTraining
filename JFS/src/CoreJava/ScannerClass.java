package CoreJava;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner scan=new Scanner(System.in);
      System.out.println("Enter your Name:");
      String name=scan.nextLine();
      
      System.out.println("Enter Age:");
      int age=scan.nextInt();
      System.out.println("Enter your Mobile Number");
      long no=scan.nextLong();
      System.out.println("Name: "+name);
      System.out.println("Age: "+age);
      System.out.println("Mobile Number: "+no);
      System.out.println("Are you above 18");
      boolean bn=scan.nextBoolean();
      if(bn==true)
      {
    	  System.out.println("You are eligible to Vote");
      }
      else
      {
    	  System.out.println("You are not eligible to Vote");
      }
      scan.close();
      
	}

}
