package io.security.securityAssignment2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomLogin {
	
	@GetMapping("/hello")
	public String Hello() {
		String s = "<h1>HelloWorld</h1>" ;
		return (s);
		
	}

}

