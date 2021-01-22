package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Services {

	@GetMapping("/services/abc")
	public ResponseEntity<String> authenticate1() {
		System.out.println("abc/123 okokokok");
		return ResponseEntity.ok("/services/abc1");
	}
	
	@GetMapping("/test/abc")
	public ResponseEntity<String> authenticate2() {
		System.out.println("/test/abc ok ok");
		return ResponseEntity.ok("/test/abc1");
	}
	
	@GetMapping("/")
	public ResponseEntity<String> authenticate() {
		System.out.println("okokokok");
		return ResponseEntity.ok("/OK1");
	}
	
	@GetMapping("/services1/abc")
	public ResponseEntity<String> authenticate3() {
		System.out.println("abc/123 okokokok");
		return ResponseEntity.ok("/services1/abc1");
	}
	
	@GetMapping("/quan/abc")
	public ResponseEntity<String> authenticate4() {
		System.out.println("abc/123 okokokok");
		return ResponseEntity.ok("/quan/abc1");
	}
	

}
