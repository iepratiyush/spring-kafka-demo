package com.example.usernotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class UserNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserNotificationApplication.class, args);
	}

	@KafkaListener(id = "user", topics = { "sports-news", "tech-news", "entertainment-news" })
	public void listen(String news) {
		System.out.println("*******NEWS********");
		System.out.println(news);
	}

}
