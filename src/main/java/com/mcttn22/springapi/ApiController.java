package com.mcttn22.springapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@GetMapping("/")
	public String getData() {
		return "Get request";
	}
	@PostMapping("/")
	public String postData() {
		return "Post request";
	}
}

