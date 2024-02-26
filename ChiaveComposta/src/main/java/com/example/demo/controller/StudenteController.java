package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Studente;
import com.example.demo.service.StudenteService;

@RestController
@RequestMapping("/api/studente")
public class StudenteController {

	@Autowired
	private StudenteService studenteService;
	
	@PostMapping("/inserisciStudente")
	public void inserisciStudente(@RequestBody Studente studente) {
		studenteService.inserisciStudente(studente);
	}
	
	@GetMapping("/visualizzaStudenti")
	public List<Studente> visualizzaStudenti(){
		return studenteService.visualizzaStudenti();
	}
}
