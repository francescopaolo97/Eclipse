package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.OrdineProdottoService;

@RestController
@RequestMapping("/api/ordineProdotto")
public class OrdineProdottoController {

	@Autowired
	private OrdineProdottoService ordineProdottoService;
}
