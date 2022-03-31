package MySpEl;

import java.awt.print.Book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("SpElConfig.xml");
		Book1 B1=(Book1)context.getBean("b1");
		System.out.println(B1);
		Book2 B2=(Book2)context.getBean("b2");
		System.out.println(B2);
		

	}

}
