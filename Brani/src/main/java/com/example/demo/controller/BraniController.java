package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Brani;
import com.example.demo.service.BraniService;

@RestController
@RequestMapping("/api/brani")
public class BraniController {

	@Autowired
	private BraniService braniService;
	
	@PostMapping("/aggiungiBrano")
	public void aggiungiBrano(@RequestBody Brani brano) {
		braniService.aggiungiBrano(brano);
	}
	
	@GetMapping("/visualizzaBrani")
	public List<Brani> visualizzaBrani(){
		return braniService.visualizzaBrani();
	}
}
