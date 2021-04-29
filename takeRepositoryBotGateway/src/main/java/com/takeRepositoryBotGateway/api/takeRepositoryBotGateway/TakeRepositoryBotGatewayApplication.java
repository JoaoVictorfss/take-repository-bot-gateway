package com.takeRepositoryBotGateway.api.takeRepositoryBotGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TakeRepositoryBotGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TakeRepositoryBotGatewayApplication.class, args);
	}

}
