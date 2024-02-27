package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.OrdineProdottoRepository;

@Service
public class OrdineProdottoService {

	@Autowired
	private OrdineProdottoRepository ordineProdottoRepository;
}
