package CoreJava;

public class ControlStmt {
	public static void main(String args[]) {
	
	int i,a=5,b=6;
	System.out.println("-------For Loop------");
	for(i=1;i<=5;i++)
	{
	System.out.println(a+b);
	}

	System.out.println("--------While Loop-----");
	int j=1;
	while(j<=10)
	{
	System.out.println("2*"+j+"="+2*j);
	j=j+1;
	}
	System.out.println("-------Do-While Loop------");
	int k=1;
	do
	{
	System.out.println("3*"+k+"="+3*k);
	k=k+1;
	}while(k<=10);

}}

