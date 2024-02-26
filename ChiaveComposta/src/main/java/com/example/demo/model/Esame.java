package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Esame {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nomeEsame;
	
	@OneToMany(mappedBy = "esame")
	private List<Voti> listaVoti;

	public Esame() {
		super();
	}

	public Esame(long id, String nomeEsame, List<Voti> listaVoti) {
		super();
		this.id = id;
		this.nomeEsame = nomeEsame;
		this.listaVoti = listaVoti;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeEsame() {
		return nomeEsame;
	}

	public void setNomeEsame(String nomeEsame) {
		this.nomeEsame = nomeEsame;
	}

	public List<Voti> getListaVoti() {
		return listaVoti;
	}

	public void setListaVoti(List<Voti> listaVoti) {
		this.listaVoti = listaVoti;
	}
}
