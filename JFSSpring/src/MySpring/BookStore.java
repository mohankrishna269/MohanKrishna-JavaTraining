package MySpring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookStore implements InitializingBean,DisposableBean {
	public void sales() {
		System.out.println("I m in Sales");
		
	}
	@PostConstruct
	public void first() {
		System.out.println("Bean Instantiated progress is in init method");
	}
	@PreDestroy
	public void last() {
		System.out.println("Going to be Destroyed");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("AfterPropertiesSet");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method");
	}

}
