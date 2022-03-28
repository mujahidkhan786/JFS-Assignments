package io.security.securityAssignment1;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloWorld {
	

	@GetMapping("/admin")
	public String admin() {
		return ("<h1>HELLO WORLD</h1>");
	}


}
