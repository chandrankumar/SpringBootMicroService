package com.micro.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

	@GetMapping("/save")
	public String saveMember() {
		return "saved";
	}
}
