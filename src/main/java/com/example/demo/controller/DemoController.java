package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping(value = "/test", method = RequestMethod.GET)
public class DemoController {
	@RequestMapping("/hello")
	public String test(){
		return"docker ---hello--word";
	}
}
