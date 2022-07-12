package com.chainsys.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Service {
	@RequestMapping("/come")
	public String welcomePage() {
		return "<h1>Welcome</h1>";
	}

	@RequestMapping("/home")
	public String homePage() {
		String html = "<div>Spring Boot is an open source Java-based framework used to create a micro Service. It is developed by Pivotal Team and is used to build stand-alone and ...</div>";
		return html;
	}

	@RequestMapping("/getdata")
	public String getData(@RequestParam(value = "city", defaultValue = "bengaluru") String city) {
		return "<h1>Welcome to "+city+"</h1>";
	}
}
