package JUnitPackage;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.BeforeAll;

import Controller.*;
import View.*;

import org.junit.jupiter.api.Test;

class ProjectTest {
	
	static ProductController productcontroller=null;
	static JdbcDriverClass projectview=null;
	
	@BeforeAll
	static void setup() {
		productcontroller=new ProductController();
		projectview=new JdbcDriverClass();
		
	}
	

	@Test
	void test() throws ClassNotFoundException, SQLException {
		//fail("Not yet implemented");
		//projectview.display();
		//assertEquals(1,productcontroller.save());
		
	    productcontroller.save();
	}

}
