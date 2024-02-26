package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Brani {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String titolo;
	private String artista;
	private String collegamento;
	private String immagine;
	
	public Brani() {
		super();
	}

	public Brani(long id, String titolo, String artista, String collegamento, String immagine) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.artista = artista;
		this.collegamento = collegamento;
		this.immagine = immagine;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getCollegamento() {
		return collegamento;
	}

	public void setCollegamento(String collegamento) {
		this.collegamento = collegamento;
	}

	public String getImmagine() {
		return immagine;
	}

	public void setImmagine(String immagine) {
		this.immagine = immagine;
	}
}
