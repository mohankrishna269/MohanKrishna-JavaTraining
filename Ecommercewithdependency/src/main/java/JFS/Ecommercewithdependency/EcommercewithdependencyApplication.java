package JFS.Ecommercewithdependency;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommercewithdependencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommercewithdependencyApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext context) {
//		return args->{
//			String[] beanNames=context.getBeanDefinitionNames();
//			System.out.println("Lets view the beans:");
//			for(String b:beanNames) 
//				System.out.println(b);
//		};
//	}

}
