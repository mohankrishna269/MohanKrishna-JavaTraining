package mypkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FeignImpl {
	
	@Autowired
	FeignInterface feigninterface;
	
	@GetMapping("/username")
	public String getname()
	{
		return feigninterface.getname();
	}
	@GetMapping("/nickname")
	public String getNickName()
	{
		return feigninterface.getNickName();
	}
	@GetMapping("/id")
	public String getId()
	{
		return feigninterface.getId();
	}
	@GetMapping("/place")
	public String getPlace()
	{
		return feigninterface.getPlace();
	}
	@GetMapping("/dept")
	public String getDept()
	{
		return feigninterface.getDept();
	}
	
	

}
