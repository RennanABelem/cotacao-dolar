package com.api.moedas.moeda.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.api.moedas.moeda.response.ResponseUSDBRL;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class CotacaoServiceImplTest {

	@Mock
	private RestTemplate restTemplate;
	
	@InjectMocks
	private CotacaoServiceImpl service = new CotacaoServiceImpl();
	
	@Test
	public void givenMockingIsDoneByMockito_whenGetIsCalled_shouldReturnMockedObject() {
		
		ResponseUSDBRL response = new ResponseUSDBRL();
		
		Mockito.when(restTemplate.getForEntity("https://economia.awesomeapi.com.br/json/last/USD-BRL", ResponseUSDBRL.class))
		.thenReturn(new ResponseEntity<ResponseUSDBRL>(response, HttpStatus.CREATED));
		
		ResponseUSDBRL resp = service.buscaCotacao();
		
		Assertions.assertEquals(response, resp);
	}
}
