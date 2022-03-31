package MySpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext context=new ClassPathXmlApplicationContext("BeanConfig.xml");
//		((AbstractApplicationContext)context).registerShutdownHook();
//		BookStore bookstore=(BookStore)context.getBean("bookstore");	
//		//BookStore bookstore=(BookStore)context.getBean("bookstore");	
//		bookstore.sales();
//         Book book=(Book)context.getBean("book");
//         Book book1=(Book)context.getBean("book");
//         System.out.println(book);
//         System.out.println(book1);
         
//         book.BookName();
//         book.BookAuthor();
//         book.BookId();         
//         book1.BookName();
//         book1.BookAuthor();
//         book1.BookId();
         
         BookPublisher bookPublisher=(BookPublisher)context.getBean("bookpublisher");
         System.out.println(bookPublisher);
		
		
		
		
		

	}

}
