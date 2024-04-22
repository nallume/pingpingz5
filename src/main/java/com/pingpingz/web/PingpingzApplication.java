package com.pingpingz.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class PingpingzApplication {

	public static void main(String[] args) {
		SpringApplication.run(PingpingzApplication.class, args);
	}

}
