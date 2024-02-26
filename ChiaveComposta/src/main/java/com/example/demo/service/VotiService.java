package com.example.demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Esame;
import com.example.demo.model.Studente;
import com.example.demo.model.StudenteVoti;
import com.example.demo.model.Voti;
import com.example.demo.model.VotiKey;
import com.example.demo.repository.EsameRepository;
import com.example.demo.repository.StudenteRepository;
import com.example.demo.repository.VotiRepository;

@Service
public class VotiService {

	@Autowired
	private VotiRepository votiRepository;
	@Autowired
	private StudenteRepository studenteRepository;
	@Autowired
	private EsameRepository esameRepository;

	public void settaVoti(long id_studente, long id_esame, int risultato) {
		VotiKey vk = new VotiKey();
		Studente studente = studenteRepository.getReferenceById(id_studente);
		Esame esame = esameRepository.getReferenceById(id_esame);
		vk.setIdStudente(studente.getId());
		vk.setIdEsame(esame.getId());
		Voti voti = new Voti(vk, studente, esame, risultato);
		votiRepository.save(voti);
	}

	public List<StudenteVoti> calcolaMedia(long id_studente) {
		List<Object[]> result = votiRepository.calcolaMedia(id_studente);
		List<StudenteVoti> listaSV = new ArrayList<>();
		for (Object[] o : result) {
			StudenteVoti st = new StudenteVoti();
			for (int i = 0; i < o.length; i++) {
				if (i == 0) {
					st.setNomeStudente((String)o[i]);
				} else if (i == 1) {
					st.setMediaVoto(((BigDecimal)o[i]).doubleValue());
				}
				// Aggiungi qui ulteriori condizioni se necessario
			}
			listaSV.add(st);
		}
		return listaSV;
	}

	public List<StudenteVoti> calcolaMediaNew(long id_studente) {
		return votiRepository.calcolaMediaNew(id_studente);
	}
}
