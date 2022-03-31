package ProductProjectUpdation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LoggerClass {
	@Before(value="execution(public void display())")
	public void beforedisp()
	{
		System.out.println("Executed before display");
	}

}
