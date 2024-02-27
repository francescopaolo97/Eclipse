package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Ordine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String descrizione;
	private String dataOrdine;
	private double latitudine;
	private double longitudine;
	
	@ManyToOne
	@JoinColumn(name = "id_utente")
	private Utente utente;
	
	@ManyToOne
	@JoinColumn(name = "id_stato")
	private Stato stato;
	
	@OneToMany(mappedBy = "ordine", cascade = CascadeType.ALL)
	private List<OrdineProdotto> listaOrdineProdotto;

	public Ordine() {
		super();
	}

	public Ordine(long id, String descrizione, String dataOrdine, double latitudine, double longitudine, Utente utente,
			Stato stato, List<OrdineProdotto> listaOrdineProdotto) {
		super();
		this.id = id;
		this.descrizione = descrizione;
		this.dataOrdine = dataOrdine;
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		this.utente = utente;
		this.stato = stato;
		this.listaOrdineProdotto = listaOrdineProdotto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getDataOrdine() {
		return dataOrdine;
	}

	public void setDataOrdine(String dataOrdine) {
		this.dataOrdine = dataOrdine;
	}

	public double getLatitudine() {
		return latitudine;
	}

	public void setLatitudine(double latitudine) {
		this.latitudine = latitudine;
	}

	public double getLongitudine() {
		return longitudine;
	}

	public void setLongitudine(double longitudine) {
		this.longitudine = longitudine;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public List<OrdineProdotto> getListaOrdineProdotto() {
		return listaOrdineProdotto;
	}

	public void setListaOrdineProdotto(List<OrdineProdotto> listaOrdineProdotto) {
		this.listaOrdineProdotto = listaOrdineProdotto;
	}
}
