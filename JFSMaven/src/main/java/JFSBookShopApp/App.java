package JFSBookShopApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		MyBook mybook=context.getBean(MyBook.class);
		mybook.displayMyBook();
		mybook.artistCount();
		
		ThrillerBook thriller=context.getBean(ThrillerBook.class);
		thriller.thriller();

	}

}
