package fr.intiformation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemowebApplication {

	@GetMapping("/")
	public String sayHello() {
		return "Hello From Spring Boot in Docker...";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemowebApplication.class, args);
	}

}
