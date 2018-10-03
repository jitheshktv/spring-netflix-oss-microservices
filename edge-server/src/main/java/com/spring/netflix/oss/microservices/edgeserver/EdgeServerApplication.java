package com.spring.netflix.oss.microservices.edgeserver;

import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulServer
public class EdgeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServerApplication.class, args);
	}
}
