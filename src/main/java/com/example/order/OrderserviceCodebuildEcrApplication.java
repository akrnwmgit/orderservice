package com.example.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class OrderserviceCodebuildEcrApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderserviceCodebuildEcrApplication.class, args);
	}

}
