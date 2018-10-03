package com.spring.netflix.oss.microservices.edgeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulServer
public class EdgeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServerApplication.class, args);
	}
}
