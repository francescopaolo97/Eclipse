package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ordine;
import com.example.demo.service.OrdineService;

@RestController
@RequestMapping("/api/ordine")
public class OrdineController {

	@Autowired
	private OrdineService ordineService;
	
	@PostMapping("/inserisciOrdine")
	public Ordine inserisciOrdine(@RequestParam long idUtente, @RequestBody Ordine ordine) {
		return ordineService.inserisciOrdine(idUtente, ordine);
	}
}
