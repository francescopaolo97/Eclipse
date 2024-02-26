package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Brani;
import com.example.demo.repository.BraniRepository;

@Service
public class BraniService {

	@Autowired
	private BraniRepository braniRepository;

	public void aggiungiBrano(Brani brano) {
		braniRepository.save(brano);
	}

	public List<Brani> visualizzaBrani() {
		return braniRepository.findAll();
	}
}
