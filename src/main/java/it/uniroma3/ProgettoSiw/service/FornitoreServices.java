package it.uniroma3.ProgettoSiw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.ProgettoSiw.model.Fornitore;
import it.uniroma3.ProgettoSiw.storage.FornitoreRepository;

@Service
public class FornitoreServices {

	@Autowired //crea da solo l'oggetto e assegnalo alla variabile
	private FornitoreRepository fornitoreRepository;
	
	@Transactional
	public Fornitore inserisci(Fornitore fornitore) {
		return fornitoreRepository.save(fornitore);
	}

	@Transactional
	public List<Fornitore> tutti() {
		return (List<Fornitore>) fornitoreRepository.findAll();
	}

	public Fornitore fornitorePerId(Long id) {
		return this.fornitoreRepository.findById(id).get();
	}
}
