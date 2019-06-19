package it.uniroma3.ProgettoSiw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import progettosilph.model.Fotografo;
import progettosilph.repository.FotografoRepository;

@Service
public class FornitoreServices {

	@Autowired //crea da solo l'oggetto e assegnalo alla variabile
	private FotografoRepository fotografoRepository;
	
	@Transactional
	public Fotografo inserisci(Fotografo fotografo) {
		return fotografoRepository.save(fotografo);
	}

	@Transactional
	public List<Fotografo> tutti() {
		return (List<Fotografo>) fotografoRepository.findAll();
	}

	public Fotografo fotografoPerId(Long id) {
		return this.fotografoRepository.findById(id).get();
	}
}
