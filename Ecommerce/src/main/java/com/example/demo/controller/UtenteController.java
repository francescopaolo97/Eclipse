package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ordine;
import com.example.demo.model.Utente;
import com.example.demo.service.UtenteService;

@RestController
@RequestMapping("/api/utente")
public class UtenteController {

	@Autowired
	private UtenteService utenteService;
	
	@PostMapping("/inserisciUtente")
	public void inserisciUtente(@RequestBody Utente utente) {
		utenteService.inserisciUtente(utente);
	}
	@GetMapping("/visualizzaDettaglioUtente")
	public Utente visualizzaDettaglioUtente(@RequestParam long idUtente) {
		return utenteService.visualizzaDettaglioUtente(idUtente);
	}
	@GetMapping("/visualizzaListaOrdiniDellUtente")
	public List<Ordine> visualizzaListaOrdiniDellUtente(@RequestParam long idUtente){
		return utenteService.visualizzaListaOrdiniDellUtente(idUtente);
	}
}
