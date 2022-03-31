package MySpring;

import org.springframework.beans.BeansException;

public class BeanPostProcessSecondClass {
	
	
	public Object postProcessBeforeInitialization(Object arg0,String arg1) throws BeansException{
		System.out.println("Before"+arg1);
		return arg0;
		
	}
	
	public Object postProcessAfterInitialization(Object arg0,String arg1) throws BeansException{
		System.out.println("after"+arg1);
		return arg0;
	}

}
