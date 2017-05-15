package com.pc.core.edgeServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EdgeServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServicesApplication.class, args);
	}
}
