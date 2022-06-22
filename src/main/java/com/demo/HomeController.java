package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	
	@RequestMapping("/form")
	public String about() {
		return "form";
	}
	
	@RequestMapping(path = "/process", method = RequestMethod.POST)
	public String process(
			@RequestParam("sName") String sName,
			@RequestParam("sRollNo") String sRollNo,
			@RequestParam("sDept") String sDept
			) {
		
		System.out.println("Name => "+sName);
		System.out.println("sRollNo => "+sRollNo);
		System.out.println("sDept => "+sDept);
		
		return "about";
	}
	
}
