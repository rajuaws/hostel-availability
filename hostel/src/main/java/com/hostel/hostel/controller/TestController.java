package com.hostel.hostel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/hostel")
	public String getHostelDetails() {
		return "my hostel not yet started..";
	}

}
