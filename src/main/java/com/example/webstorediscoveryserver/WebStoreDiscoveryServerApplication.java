package com.example.webstorediscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WebStoreDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebStoreDiscoveryServerApplication.class, args);
	}
}
