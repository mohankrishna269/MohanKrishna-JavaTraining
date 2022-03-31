package mypkg;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(value="feignDemo",url="http://localhost:8080")
public interface FeignInterface {
	@GetMapping("/name")
	String getname();
	
	@GetMapping("/nickname")
	String getNickName();
	
	@GetMapping("/id")
	String getId();
	
	@GetMapping("/id")
	String getPlace();
	
	@GetMapping("/dept")
	String getDept();
	
	
	
	

}
