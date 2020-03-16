package com.ips.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Calculator {
	@GetMapping(value = "/add/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}
}
