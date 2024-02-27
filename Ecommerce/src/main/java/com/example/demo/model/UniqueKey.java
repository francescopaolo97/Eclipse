package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class UniqueKey implements Serializable{

	private static final long serialVersionUID = 1L;

	//fa riferimento all'ordine
	@Column(name = "id_ordine")
	private long idOrdine;
	
	//fa riferimento al prodotto
	@Column(name = "id_prodotto")
	private long idProdotto;

	public UniqueKey() {
		super();
	}

	public UniqueKey(long idOrdine, long idProdotto) {
		super();
		this.idOrdine = idOrdine;
		this.idProdotto = idProdotto;
	}

	public long getIdOrdine() {
		return idOrdine;
	}

	public void setIdOrdine(long idOrdine) {
		this.idOrdine = idOrdine;
	}

	public long getIdProdotto() {
		return idProdotto;
	}

	public void setIdProdotto(long idProdotto) {
		this.idProdotto = idProdotto;
	}
}
