package it.uniroma3.ProgettoSiw.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.ProgettoSiw.model.Prodotto;
import it.uniroma3.ProgettoSiw.storage.ProdottoRepository;



@Service
public class ProdottoServices {

	@Autowired //crea da solo l'oggetto e assegnalo alla variabile
	private ProdottoRepository prodottoRepository;
	
	@Transactional
	public Prodotto inserisci(Prodotto foto) {
		return prodottoRepository.save(foto);
	}

	@Transactional
	public List<Prodotto> tutti() {
		return (List<Prodotto>) prodottoRepository.findAll();
	}

	public Prodotto prodottoPerId(Long id) {
		return this.prodottoRepository.findById(id).get();
	}
}
