package com.example.demo.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class Voti {
	
	@EmbeddedId
	private VotiKey id;
	
	@ManyToOne
	@JoinColumn(name = "id_studente")
	@MapsId("idStudente")
	private Studente studente;
	
	@ManyToOne
	@JoinColumn(name = "id_esame")
	@MapsId("idEsame")
	private Esame esame;
	
	private int risultato;

	public Voti() {
		super();
	}

	public Voti(VotiKey id, Studente studente, Esame esame, int risultato) {
		super();
		this.id = id;
		this.studente = studente;
		this.esame = esame;
		this.risultato = risultato;
	}

	public VotiKey getId() {
		return id;
	}

	public void setId(VotiKey id) {
		this.id = id;
	}

	public Studente getStudente() {
		return studente;
	}

	public void setStudente(Studente studente) {
		this.studente = studente;
	}

	public Esame getEsame() {
		return esame;
	}

	public void setEsame(Esame esame) {
		this.esame = esame;
	}

	public int getRisultato() {
		return risultato;
	}

	public void setRisultato(int risultato) {
		this.risultato = risultato;
	}
}
