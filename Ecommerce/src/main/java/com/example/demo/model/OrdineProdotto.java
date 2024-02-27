package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class OrdineProdotto {

	@EmbeddedId
	private UniqueKey id;
	
	private int quantita;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_ordine")
	@MapsId("idOrdine")
	private Ordine ordine;
	
	@ManyToOne
	@JoinColumn(name = "id_prodotto")
	@MapsId("idProdotto")
	private Prodotto prodotto;

	public OrdineProdotto() {
		super();
	}

	public OrdineProdotto(UniqueKey id, int quantita, Ordine ordine, Prodotto prodotto) {
		super();
		this.id = id;
		this.quantita = quantita;
		this.ordine = ordine;
		this.prodotto = prodotto;
	}

	public UniqueKey getId() {
		return id;
	}

	public void setId(UniqueKey id) {
		this.id = id;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public Ordine getOrdine() {
		return ordine;
	}

	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}

	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
}
