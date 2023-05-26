package com.practice.myelastic.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@Slf4j
public class DefaultController {
	@GetMapping(value = "/welcome")
	public String welcome(){
		log.info("Welcome to the first api");
		return "Welcome to my first api !!!!!";
	}
}
