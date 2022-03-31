package JFSBookShopApp;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component

public class MyFavBooks implements MyFirstBookInterface {
	
	public void myFavbk() {
		System.out.println("JAVA");
	}
	
	public void my1stBook() {
		System.out.println("I m from Interface: implemented through my favbook class");
	}
	

}
