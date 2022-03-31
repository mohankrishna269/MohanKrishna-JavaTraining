package CoreJava;

public class ExceptionHandling {
	public static void main(String[] args)
	{
		MyException obj=new MyException();
		try {
			obj.exception();
		}
		catch(OwnException m)
		{
			System.out.println(m);
			
		}
		
	}

}
