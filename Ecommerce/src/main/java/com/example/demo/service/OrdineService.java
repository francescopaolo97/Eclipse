package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ordine;
import com.example.demo.model.OrdineProdotto;
import com.example.demo.model.Prodotto;
import com.example.demo.model.UniqueKey;
import com.example.demo.repository.OrdineProdottoRepository;
import com.example.demo.repository.OrdineRepository;
import com.example.demo.repository.ProdottoRepository;
import com.example.demo.repository.StatoRepository;
import com.example.demo.repository.UtenteRepository;

@Service
public class OrdineService {
	
	@Value("${deposito.lat}")
	private double depositoLatitudine;
	@Value("${deposito.lon}")
	private double depositoLongitudine;
	

	@Autowired
	private OrdineRepository ordineRepository;
	@Autowired
	private UtenteRepository utenteRepository;
	@Autowired
	private ProdottoRepository prodottoRepository;
	@Autowired
	private OrdineProdottoRepository ordineProdottoRepository;
	@Autowired
	private StatoRepository statoRepository;
	
	
	public Ordine inserisciOrdine(long idUtente, Ordine ordine) {
		List<OrdineProdotto> listaOrdineProdotto = ordine.getListaOrdineProdotto();
		ordine.setUtente(utenteRepository.getReferenceById(idUtente));
		ordine.setLatitudine(depositoLatitudine);
		ordine.setLongitudine(depositoLongitudine);
		ordine.setStato(statoRepository.getReferenceById((long) 1));
		ordineRepository.save(ordine);
		for (OrdineProdotto op : listaOrdineProdotto) {
			UniqueKey uk = new UniqueKey();
			uk.setIdOrdine(ordine.getId());
			uk.setIdProdotto(op.getProdotto().getId());
			OrdineProdotto ordineProdotto = new OrdineProdotto();
			ordineProdotto.setId(uk);
			ordineProdotto.setOrdine(ordine);
			ordineProdotto.setProdotto(op.getProdotto());
			ordineProdotto.setQuantita(op.getQuantita());
			ordineProdottoRepository.save(ordineProdotto);
		}
		return ordine;
	}


	public Ordine modificaOrdine(long idOrdine, long idProdotto, int quantita) {
		Ordine ordine = ordineRepository.getReferenceById(idOrdine);
		ordine.getListaOrdineProdotto().forEach(o->{
			if(o.getProdotto().getId() == idProdotto) {
				o.setQuantita(quantita);
			}
		});
		ordineRepository.save(ordine);
		return ordine;
	}


	public Ordine aggiungiProdottoAllOrdine(long idOrdine, long idProdotto, int quantita) {
		Ordine ordine = ordineRepository.getReferenceById(idOrdine);
		Prodotto prodotto = prodottoRepository.getReferenceById(idProdotto);
		OrdineProdotto op = new OrdineProdotto();
		UniqueKey uk = new UniqueKey();
		uk.setIdOrdine(ordine.getId());
		uk.setIdProdotto(idProdotto);
		op.setId(uk);
		op.setOrdine(ordine);
		op.setProdotto(prodotto);
		op.setQuantita(quantita);
		ordineProdottoRepository.save(op);
//		ordine.getListaOrdineProdotto().add(op);
		return ordine;
	}
}
