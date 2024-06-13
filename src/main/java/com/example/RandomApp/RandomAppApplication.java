package com.example.RandomApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class RandomAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomAppApplication.class, args);
	}

	@GetMapping("am-i-lucky")
	public String myLuckyDay(){
		Random random = new Random();
		return random.nextBoolean() ? " It's your lucky day :D": "Oh No ! Try harder";
 	}
}
