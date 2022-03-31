package JFSBookShopApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyBook {
	@Autowired
	MyFavBooks myFavBooks;
	@Autowired
	MyFavBookImpl myFavBookImpl;
	@Autowired
	@Qualifier("myFavBooks")
	MyFirstBookInterface myfirstBookInterface;
	
	public MyFavBooks getMyFavBooks() {
		return myFavBooks;
	}
	
	public void setMyFavBooks(MyFavBooks myFavBooks) {
		this.myFavBooks=myFavBooks;
	}
	
	public void displayMyBook() {
		
		System.out.println("My Book Name is: Java 11");
		myFavBooks.myFavbk();
		myFavBooks.my1stBook();
		myFavBookImpl.my1stBook();
		myfirstBookInterface.my1stBook();
	}
	public Integer artistCount() {
		Integer artist=100;
		return artist;
	}
	public void my1stBook() {
		
	}
	
	

}
