package com.phuongvo95;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class BookSprringMvcApplication {
	
	@RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

	public static void main(String[] args) {
		SpringApplication.run(BookSprringMvcApplication.class, args);
	}
}
