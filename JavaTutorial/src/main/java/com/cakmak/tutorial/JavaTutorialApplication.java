package com.cakmak.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaTutorialApplication {
	//Main Class Test
	public static void selamlama() {
		System.out.println("ksjksjskj");
		System.out.println("adınız ne ");
	}
	public static void main(String[] args) {
		SpringApplication.run(JavaTutorialApplication.class, args);
		selamlama();
	}

}
