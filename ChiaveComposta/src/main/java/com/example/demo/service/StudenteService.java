package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Studente;
import com.example.demo.repository.StudenteRepository;

@Service
public class StudenteService {

	@Autowired
	private StudenteRepository studenteRepository;

	public void inserisciStudente(Studente studente) {
		studenteRepository.save(studente);
	}

	public List<Studente> visualizzaStudenti() {
		return studenteRepository.findAll();
	}
}
