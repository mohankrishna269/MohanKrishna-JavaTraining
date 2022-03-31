import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Model.ProductClass;
//import Controller.*;
//import View.*;

import JUnitPackage.JUnitClass;

class JunitTestCase {
	
	public static JUnitClass unitTest;
	public static Scanner scanner;
	ProductClass p=new ProductClass(1,"Redmi","Blue",15000);
	@Test
	void id() {
		
		assertEquals(1,p.getProduct_id());
		assertEquals("Redmi",p.getProduct_name());	
		System.out.println("Id Executed");
	}
	@Test
	void name() {
		
		assertNotEquals("Redmi",p.getProduct_id());	
	}
	

	@Test
	void test1() {
		//fail("Not yet implemented");
		JUnitClass unitTest=new JUnitClass();
		int exp_result=unitTest.mul(2,3);
		assertEquals(6,exp_result);

		
	}
	@BeforeEach
	void setup()
	{
		System.out.println("Test Case Started");
	}
	
	@AfterEach
	void set() {
		System.out.println("Test Case Executed Succesfuly");
	}
	
    
	@Test
	void test2() {
		//fail("Not yet implemented");
		JUnitClass unitTest=new JUnitClass();
		int exp_result=unitTest.add(2,3);
		assertEquals(5,exp_result);
	

       }
    
	
	@Test
      void test3() {
    	JUnitClass unitTest=new JUnitClass();
    	
        String exp_result1=unitTest.concatstring("hi","There");
	    assertEquals("hiThere",exp_result1);
        }
	
}
