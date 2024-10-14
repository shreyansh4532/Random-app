package com.shreyansh.demo_1;

import foo.bar.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);

		WelcomeMessage w = new WelcomeMessage();
		System.out.print(w.getMsg());
	}

}
