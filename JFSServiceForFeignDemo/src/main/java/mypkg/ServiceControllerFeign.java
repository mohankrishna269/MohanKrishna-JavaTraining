package mypkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceControllerFeign {
	
	@GetMapping("/name")
	public String getname() {
		return "Mohan";
	}
	@GetMapping("/nickname")
	public String getNickName() {
		return "Krishna";
	}
	@GetMapping("/id")
	public String getId() {
		return "48";
	}
	@GetMapping("/place")
	public String getPlace() {
		return "Chennai";
	}
	@GetMapping("/dept")
	public String getDept() {
		return "IT";
	}

}
