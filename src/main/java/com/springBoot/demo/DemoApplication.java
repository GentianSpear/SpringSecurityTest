package com.springBoot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	public String hello(){
		return "hello springboot!!!";
	}
	@RequestMapping("/hello")
	public String yanzheng(){
		return "hello";
	}

	@RequestMapping("/helloWorld")
	public String yan(){
		return "hello  world";
	}
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping("/roleAuth")
	public String role(){
		return "admin role";
	}
	//方法调用之前 验证
	@PreAuthorize("#id<10 and principal.username.equals(#userName)")
	//方法调用之后 验证
	//@PostAuthorize()
	@RequestMapping("/test")
	public String test(Integer id,String userName){
		return "test auth";
	}
}
