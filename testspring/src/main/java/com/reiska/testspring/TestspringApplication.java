package com.reiska.testspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestspringApplication.class, args);
	}

	@GetMapping
	public List<Player> welcome(){

		Student s = new Student();

		Player p = new Player();
		p.name = "Repo";
		p.age = 20;
		List<Player> plist = new ArrayList<>();
		plist.add(p);

		System.out.println("****************");

		return plist;
	}
}
