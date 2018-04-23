package com.service.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ServiceController {

	@GetMapping(value = "/hello")
	public String hello() {
		return "helloworld";
	}

	@PostMapping(value = "/data", produces = { "application/xml", "application/json" }, consumes = { "application/xml",
			"application/json" })
	public String parserMethod(@RequestBody String a) {
		return a;
	}
}
