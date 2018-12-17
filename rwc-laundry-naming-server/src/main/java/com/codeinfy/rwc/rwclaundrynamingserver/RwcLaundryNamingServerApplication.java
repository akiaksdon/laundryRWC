package com.codeinfy.rwc.rwclaundrynamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RwcLaundryNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RwcLaundryNamingServerApplication.class, args);
	}

}

