package com.example.springbootconfig;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingController {
	
	/*@Value("${my.greeting}")
	private String greetingMessage;
	
	@Value("${my.Value}")
	private List<String> listValue;
	
	@Value("#{${dbValues}}")
	private Map<String, String> dbValues;*/
	
	@Autowired
	private DbSettings dbsettings;
	
	@Autowired
	private Environment env;
	
	public GreetingController() {
		
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		//return greetingMessage + listValue + dbValues;
		return dbsettings.getConnection() + dbsettings.getHost();
	}
	
	@GetMapping("/envdetails")
	public String envDetails() {
		return env.toString();
		
	}

}
