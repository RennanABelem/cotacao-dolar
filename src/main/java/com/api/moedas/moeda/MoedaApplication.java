package com.api.moedas.moeda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MoedaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoedaApplication.class, args);
	}

	@Bean
	public ClientHttpRequestFactory clientHttpRequestFactory() {
	    SimpleClientHttpRequestFactory simpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory();
	    ClientHttpRequestFactory clientHttpRequestFactory = new BufferingClientHttpRequestFactory(simpleClientHttpRequestFactory);

	    return clientHttpRequestFactory ;
	}

	@Bean
	public RestTemplate restTemplate(ClientHttpRequestFactory clientHttpRequestFactory) {
	    RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
	    return restTemplate;
	}
}
