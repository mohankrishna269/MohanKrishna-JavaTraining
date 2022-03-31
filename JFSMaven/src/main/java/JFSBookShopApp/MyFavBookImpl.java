package JFSBookShopApp;

import org.springframework.stereotype.Component;

@Component
public class MyFavBookImpl implements MyFirstBookInterface {
	public void my1stBook() {
		
		System.out.println("I m from Interface: Implemented through MyFirstBook Impl class");
		
	}

}
