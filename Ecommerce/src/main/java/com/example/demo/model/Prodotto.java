package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Prodotto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String descrizione;
	

	@OneToMany(mappedBy = "prodotto")
	private List<OrdineProdotto> listaOrdineProdotto;

	public Prodotto() {
		super();
	}

	public Prodotto(long id, String nome, String descrizione, List<OrdineProdotto> listaOrdineProdotto) {
		super();
		this.id = id;
		this.nome = nome;
		this.descrizione = descrizione;
		this.listaOrdineProdotto = listaOrdineProdotto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<OrdineProdotto> getListaOrdineProdotto() {
		return listaOrdineProdotto;
	}

	public void setListaOrdineProdotto(List<OrdineProdotto> listaOrdineProdotto) {
		this.listaOrdineProdotto = listaOrdineProdotto;
	}
}
