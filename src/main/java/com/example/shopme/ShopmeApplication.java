package com.example.shopme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com/example/shopme/entity", "com/example/shopme/repository"})
public class ShopmeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopmeApplication.class, args);
	}

}
