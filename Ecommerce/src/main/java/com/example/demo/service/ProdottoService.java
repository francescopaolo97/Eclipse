package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Prodotto;
import com.example.demo.repository.ProdottoRepository;

@Service
public class ProdottoService {

	@Autowired
	private ProdottoRepository prodottoRepository;

	public void inserisciProdotto(Prodotto prodotto) {
		prodottoRepository.save(prodotto);
	}
}
