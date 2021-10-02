package com.example.demo5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleHelloController {
	@GetMapping("/hello")
	public String hello() {
		return "hello darling";
	}
}
