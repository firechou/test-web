package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RestController
public class MainController {
	
	@RequestMapping(value="/hello", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String hello() {
		System.out.println("do something here ... ");
		return "hello zhouyan ...啊啊";
	}
	
}
