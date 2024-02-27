package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Stato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String codice;
	private String descrizione;
	
	@JsonIgnore
	@OneToMany(mappedBy = "stato")
	private List<Ordine> listaOrdini;

	public Stato() {
		super();
	}

	public Stato(long id, String codice, String descrizione, List<Ordine> listaOrdini) {
		super();
		this.id = id;
		this.codice = codice;
		this.descrizione = descrizione;
		this.listaOrdini = listaOrdini;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<Ordine> getListaOrdini() {
		return listaOrdini;
	}

	public void setListaOrdini(List<Ordine> listaOrdini) {
		this.listaOrdini = listaOrdini;
	}
}
