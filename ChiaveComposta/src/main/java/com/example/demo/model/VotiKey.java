package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class VotiKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "id_studente")
	private long idStudente;
	
	@Column(name = "id_esame")
	private long idEsame;

	public VotiKey() {
		super();
	}

	public VotiKey(long idStudente, long idEsame) {
		super();
		this.idStudente = idStudente;
		this.idEsame = idEsame;
	}

	public long getIdStudente() {
		return idStudente;
	}

	public void setIdStudente(long idStudente) {
		this.idStudente = idStudente;
	}

	public long getIdEsame() {
		return idEsame;
	}

	public void setIdEsame(long idEsame) {
		this.idEsame = idEsame;
	}
}
