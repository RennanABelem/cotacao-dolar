package com.api.moedas.moeda.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.api.moedas.moeda.response.ResponseUSDBRL;
import com.api.moedas.moeda.service.CotacaoService;

@Service
public class CotacaoServiceImpl implements CotacaoService{

	@Autowired
	private RestTemplate restTemplate;
	
	public ResponseUSDBRL buscaCotacao() {
		
		ResponseEntity<ResponseUSDBRL> response = 
				restTemplate.getForEntity("https://economia.awesomeapi.com.br/json/last/USD-BRL", ResponseUSDBRL.class);
		System.out.println("Response " + response.getBody());
		
		
		return response.getBody();
	}

}
