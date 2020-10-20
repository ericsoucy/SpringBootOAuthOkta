package com.example.okta.oauth2oktaauthzserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;


@SpringBootApplication
@EnableResourceServer
public class Oauth2OktaAuthzServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2OktaAuthzServerApplication.class, args);
	}

}
