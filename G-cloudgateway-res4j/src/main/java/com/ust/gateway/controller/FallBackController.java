package com.ust.gateway.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class FallBackController {
	@RequestMapping("/myfallback")
	public ResponseEntity<String> fallBackMethod() {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("please try again after some time");
	}
	
}
