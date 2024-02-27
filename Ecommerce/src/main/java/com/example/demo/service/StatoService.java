package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Stato;
import com.example.demo.repository.StatoRepository;

@Service
public class StatoService {

	@Autowired
	private StatoRepository statoRepository;

	public void inserisciStato(Stato stato) {
		statoRepository.save(stato);
	}
}
