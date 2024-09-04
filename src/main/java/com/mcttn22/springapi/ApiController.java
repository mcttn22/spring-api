package com.mcttn22.springapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@GetMapping("/")
	public String getData() {
		return "Hello World!";
	}
}

