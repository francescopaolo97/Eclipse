package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudenteVoti;
import com.example.demo.service.VotiService;

@RestController
@RequestMapping("/api/voti")
public class VotiController {

	@Autowired
	private VotiService votiService;
	
	@PostMapping("/settaVoti")
	public void settaVoti(@RequestParam long id_studente, @RequestParam long id_esame, @RequestParam int risultato) {
		votiService.settaVoti(id_studente, id_esame, risultato);
	}
	
	@GetMapping("/calcolaMedia")
	public List<StudenteVoti> calcolaMedia(@RequestParam long id_studente){
		return votiService.calcolaMedia(id_studente);
	}
	
	@GetMapping("/calcolaMediaNew")
	public List<StudenteVoti> calcolaMediaNew(@RequestParam long id_studente){
		return votiService.calcolaMediaNew(id_studente);
	}
}
