package JFSBookShopApp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;

@Component
@Aspect
@EnableAspectJAutoProxy

public class LogInfoClass {
	
	
	@Before(value= "execution(public void displayMyBook())")
	public void BeforeDisplayMyBook(JoinPoint jointPoint) {
		System.out.println("Log info: Method is insideMyBook");
		System.out.println("Log info: Method name is displayMyBook");
		System.out.println("Static info: "+jointPoint.getStaticPart());
            }
	
	
	@After(value= "execution(public void displayMyBook())")
	public void AfterdisplayMyBook() {
		System.out.println("After My Book");
	}
	
	
	@After("execution(public void displayMyBook())")
	public void AfterdisplayBook(JoinPoint jointPoint) {
		System.out.println("Log info: "+jointPoint.getSignature().getName());
		System.out.println("Location info: "+jointPoint.getSourceLocation());
		System.out.println("Class info: "+jointPoint.getClass());
		System.out.println("Static info: "+jointPoint.getStaticPart());
		System.out.println("Target info: "+jointPoint.getTarget());
		
		
		System.out.println("Getting method Execution");
	}
	
	
//	@AfterReturning(value="execution(public Integer artistCount())",returning="artist")
//	public void AfterReturning() {
//		System.out.println("Log Info: After ReturningArtistCount");
//	}
//	
//	
//	//@Pointcut("execution(* MyBook.displayMyBook(..))")
//	@Pointcut("execution(* com.JFSBookShopApp.MyBook.*(..))")
//	public void pointcut()
//	{
//		
//	}
//	
//	
//	@Around("pointcut()")
//		public void Aroundptcut() {
//			System.out.println("Log info: Around Annotation");
//		}
//	
//	
//	@Before(value= "execution(public void thriller())")
//	public void BeforeDisplaythriller() {
//		//System.out.println("Log info: Method is insideMyBook");
//		System.out.println("Log info: Displayed before Thriller");
//            }
//	
	
	}


		


