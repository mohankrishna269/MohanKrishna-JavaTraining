package CoreJava;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=10,b=20;
		Integer C=a+b;
		Float f=3.44f;
		Boolean B=true;
		
		System.out.println(C);
		System.out.println("------Wrapper Classes-------");
		int c=C;
		System.out.println(C.SIZE);
		System.out.println("-----Out Boxing-----");
		
		System.out.println(c);
		
		
		System.out.println(B);
		System.out.println(B.TYPE);
		System.out.println(c+"  "+f);
		System.out.println(a.getClass());
		

	}

}
