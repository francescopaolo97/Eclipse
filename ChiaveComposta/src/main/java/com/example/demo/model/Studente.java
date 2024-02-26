package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Studente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nomeStudente;
	
	@OneToMany(mappedBy = "studente")
	private List<Voti> listaVoti;

	public Studente() {
		super();
	}

	public Studente(long id, String nomeStudente, List<Voti> listaVoti) {
		super();
		this.id = id;
		this.nomeStudente = nomeStudente;
		this.listaVoti = listaVoti;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeStudente() {
		return nomeStudente;
	}

	public void setNomeStudente(String nomeStudente) {
		this.nomeStudente = nomeStudente;
	}

	public List<Voti> getListaVoti() {
		return listaVoti;
	}

	public void setListaVoti(List<Voti> listaVoti) {
		this.listaVoti = listaVoti;
	}
	 
}
