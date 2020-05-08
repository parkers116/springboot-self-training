package com.example.demo;

//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController
@Controller
public class SpringbootHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	@RequestMapping("/")
//	public String hello(){
//		return "Hello World!";
//	}

	@GetMapping("/x")
	public String hello() {
		return "Hello World!";
	}

	@GetMapping("/index")
	public String index() {
		return "index";
	}

}
