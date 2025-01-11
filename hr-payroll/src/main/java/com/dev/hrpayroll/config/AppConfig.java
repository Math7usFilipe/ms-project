package com.dev.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	//bean
	//registramos uma instancia unica do objeto restTemplate
	//que fica disponivel para ser injetada em outros serviços
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
