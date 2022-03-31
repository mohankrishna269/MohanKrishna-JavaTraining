package mypkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricketController {
	   @GetMapping("/cricket")
       public String cricket() {
    	   return "Welcome to cricket Score Page";
       }

}
