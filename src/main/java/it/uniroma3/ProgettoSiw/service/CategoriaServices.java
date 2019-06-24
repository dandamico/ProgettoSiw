package it.uniroma3.ProgettoSiw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.ProgettoSiw.model.Categoria;
import it.uniroma3.ProgettoSiw.repository.CategoriaRepository;



@Service
public class CategoriaServices {

	@Autowired //crea da solo l'oggetto e assegnalo alla variabile
	private CategoriaRepository categoriaRepository;
	
	@Transactional
	public Categoria inserisci(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	@Transactional
	public List<Categoria> tutti() {
		return (List<Categoria>) categoriaRepository.findAll();
	}

	public Categoria categoriaPerId(Long id) {
		return this.categoriaRepository.findById(id).get();
	}
}
