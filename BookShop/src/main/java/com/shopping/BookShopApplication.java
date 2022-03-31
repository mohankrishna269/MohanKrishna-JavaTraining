package com.shopping;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BookShopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(BookShopApplication.class, args);
		Book b=context.getBean(Book.class);
		System.out.println("========================================= Book Details =================================================");
		System.out.println("\t"+b);
		Discount d=context.getBean(Discount.class);
		d.offer();
		
	}

}
