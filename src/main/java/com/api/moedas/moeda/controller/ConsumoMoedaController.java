package com.api.moedas.moeda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.moedas.moeda.response.ResponseUSDBRL;
import com.api.moedas.moeda.service.CotacaoService;

@RestController
@RequestMapping("consulta-cotacao")
public class ConsumoMoedaController {

	@Autowired
	private CotacaoService service;
	
	@GetMapping
	public ResponseEntity<ResponseUSDBRL> consultaDolar(){
		
		return new ResponseEntity<>(service.buscaCotacao(), HttpStatus.OK);
	}
	
}
