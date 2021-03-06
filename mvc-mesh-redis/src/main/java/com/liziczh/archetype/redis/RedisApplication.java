package com.liziczh.archetype.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.liziczh.*" })
public class RedisApplication {
	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);
	}
}
