package com.micro.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MemberMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemberMicroServiceApplication.class, args);
	}
}
