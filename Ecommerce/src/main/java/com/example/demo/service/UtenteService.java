package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ordine;
import com.example.demo.model.Utente;
import com.example.demo.repository.UtenteRepository;

@Service
public class UtenteService {

	@Autowired
	private UtenteRepository utenteRepository;

	public void inserisciUtente(Utente utente) {
		utenteRepository.save(utente);
	}

	public Utente visualizzaDettaglioUtente(long idUtente) {
		return utenteRepository.getReferenceById(idUtente);
	}

	public List<Ordine> visualizzaListaOrdiniDellUtente(long idUtente) {
		return utenteRepository.getReferenceById(idUtente).getListaOrdini();
	}
}
