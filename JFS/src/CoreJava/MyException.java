package CoreJava;
import java.util.Scanner;

public class MyException {
	Scanner s=new Scanner(System.in);
	public void exception() throws OwnException {
		
    System.out.println("Enter String");		
		
	
	String str=s.nextLine();
	if(str.length()>5 || str.charAt(0)=='A')
	{
		//System.out.println(str);
		throw new OwnException("Exception Occured");
		
		
	}
	else
	{
		throw new OwnException("No Exception");
	}
	}

}
