package com.sz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello (){
		return "王菲菲菲等等12321";
				
	}

}
