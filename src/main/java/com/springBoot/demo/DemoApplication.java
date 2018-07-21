package com.springBoot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/springBoot")
	public String hello(){
		return "hello springboot!!!";
	}
	@RequestMapping("/hello")
	public String yanzheng(){
		return "hello";
	}

	@RequestMapping("/helloWorld ")
	public String yan(){
		return "hello  world";
	}
}
