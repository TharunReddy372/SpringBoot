package com.ciq.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	
	
	@Value("${myname}")
	private String name;
	
	@Value("${location}")
	private String location;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/hello")
	public @ResponseBody String sayHello() {
		System.out.println("Name : "+env.getProperty("myname")+", Location : "+env.getProperty("location"));
		return "Hello "+name+" : "+location;
	}

}
