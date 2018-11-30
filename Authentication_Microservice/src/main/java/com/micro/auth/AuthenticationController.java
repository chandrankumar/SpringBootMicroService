package com.micro.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

	@GetMapping("/home")
	public String authenticate() {
		return "authenticated";
	}
	
}
