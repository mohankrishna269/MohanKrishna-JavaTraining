package CoreJava;
import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int even[]=new int[10];
		int odd[]=new int[10];
		int prime[]= {2,3,5,7};
		int a[]=new int[5];
		System.out.println("-----Even numbers----");
		for(int i=0;i<8;i++)//even logic
		{
			even[i]=i*2;
		}
		for(int i=0;i<8;i++)//printing even numbers
		{
		System.out.println(even[i]);
		}
		System.out.println("-----odd numbers----");
		int var=1;
		for(int i=0;i<6;i++) {//odd logic
			odd[i]=var;
			var=var+2;
		}
		for(int i=0;i<5;i++)//printing even numbers
		{
		System.out.println(odd[i]);
		}
	
		System.out.println("----Prime Numbers----");
		for(int i=0;i<prime.length;i++)
		{
		System.out.println(prime[i]);
		}
		System.out.println("Enter the numbers");
		for(int i=0;i<5;i++) {
			a[i]=scan.nextInt();
			
		}
		System.out.println("Scanned Numbers");
		
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
