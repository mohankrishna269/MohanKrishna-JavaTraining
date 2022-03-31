package ProductProjectUpdation;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import JFSBookShopApp.AppConfig;
import ProductProjUpdationView.JdbcDriverClass;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcDriverClass proj=context.getBean(JdbcDriverClass.class);
		proj.demo();
		proj.display();

	}

}
