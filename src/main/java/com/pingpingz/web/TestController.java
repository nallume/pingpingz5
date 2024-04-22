package com.pingpingz.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
	
	@GetMapping("/api/test")
	public List<String> getTest() {
		List<String> test = new ArrayList<>();
		test.add("Hi");
		test.add("there");
		test.add("!");
		return test;
	}
	

}
