package com.example.demo.model;

public class StudenteVoti {

	private String nomeStudente;
	private double mediaVoto;
	
	public StudenteVoti() {
		super();
	}

	public StudenteVoti(String nomeStudente, double mediaVoto) {
		super();
		this.nomeStudente = nomeStudente;
		this.mediaVoto = mediaVoto;
	}

	public String getNomeStudente() {
		return nomeStudente;
	}

	public void setNomeStudente(String nomeStudente) {
		this.nomeStudente = nomeStudente;
	}

	public double getMediaVoto() {
		return mediaVoto;
	}

	public void setMediaVoto(double mediaVoto) {
		this.mediaVoto = mediaVoto;
	}
}
