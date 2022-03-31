package mypkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/home")
	public String home() {
		
		String cricket=restTemplate.getForObject("http://localhost:8082/cricket",String.class);
		return cricket;
	}

}
