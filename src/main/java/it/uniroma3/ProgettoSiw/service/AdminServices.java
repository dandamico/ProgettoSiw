package it.uniroma3.ProgettoSiw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import progettosilph.model.Funzionario;
import progettosilph.repository.FunzionarioRepository;

@Service
public class AdminServices {

	@Autowired //crea da solo l'oggetto e assegnalo alla variabile
	private FunzionarioRepository funzRepository;
	
	@Transactional
	public Funzionario inserisci(Funzionario funz) {
		return funzRepository.save(funz);
	}

	@Transactional
	public List<Funzionario> tutti() {
		return (List<Funzionario>) funzRepository.findAll();
	}

	public Funzionario funzionarioPerId(Long id) {
		return this.funzRepository.findById(id).get();
	}
}