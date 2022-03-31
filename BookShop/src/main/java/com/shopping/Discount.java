package com.shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Discount {
	@Autowired
	Book book;
	//@Value("#(book.price)")
	public void offer() {
		{
			if((book.price)>500)
			{
				
				System.out.println("\t\t\t*******Congratulations*********\n");
				System.out.println("\t\t\t******Discount Available*******");
			}
			else
			{
				System.out.println("Discount not available");
			}
		}
	}

}
