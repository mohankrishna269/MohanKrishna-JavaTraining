package Java11;


	interface PrivateInterface{
		public abstract void abstractMethod();
		
		private static void privateMethod() {
			System.out.println("I m inside Private Method");
		}
		public default void defaultMethod() {
			privateMethod();
		}
		public default void staticMethod() {
			privateMethod();
		}
	}


	public class privateMethodInterface implements PrivateInterface {
		public void abstractMethod() {
			System.out.println("Im inside abstract method in main");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		privateMethodInterface obj=new privateMethodInterface();
		obj.abstractMethod();
		obj.defaultMethod();
		obj.staticMethod();

	}
}
	


