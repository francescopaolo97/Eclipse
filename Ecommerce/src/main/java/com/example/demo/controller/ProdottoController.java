package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Prodotto;
import com.example.demo.service.ProdottoService;

@RestController
@RequestMapping("/api/prodotto")
public class ProdottoController {

	@Autowired
	private ProdottoService prodottoService;
	
	@PostMapping("/inserisciProdotto")
	public void inserisciProdotto(@RequestBody Prodotto prodotto) {
		prodottoService.inserisciProdotto(prodotto);
	}
}
