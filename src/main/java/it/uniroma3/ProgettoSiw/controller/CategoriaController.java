package it.uniroma3.ProgettoSiw.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.ProgettoSiw.model.Categoria;
import it.uniroma3.ProgettoSiw.service.CategoriaServices;
import it.uniroma3.ProgettoSiw.service.CategoriaValidator;



@Controller
public class CategoriaController {

	@Autowired
	private CategoriaValidator categoriaValidator;

	@Autowired
	private CategoriaServices categoriaService;

	@RequestMapping(value = "/categoria", method = RequestMethod.POST)
	public String newCategoria(@Valid @ModelAttribute("categoria") Categoria categoria,		
			Model model, BindingResult bindingResult) {
		this.categoriaValidator.validate(categoria, bindingResult);

		if(!bindingResult.hasErrors()) {
			this.categoriaService.inserisci(categoria);
			model.addAttribute("categorie", this.categoriaService.tutti());
			return "categorie.html";
		} else {
			return "inserisciCategoria.html";
		}
	}

	@RequestMapping(value = "/categoria/{id}", method = RequestMethod.GET)
	public String getCategoria(@PathVariable ("id") Long id, Model model) {
		if(id != null) {
			model.addAttribute("categoria", this.categoriaService.categoriaPerId(id));
			return "categoria.html"; 
		} else {
			model.addAttribute("categorie", this.categoriaService.tutti());
			return "categorie.html"; 
		}
	}
	
	@RequestMapping("/addCategoria")
	public String addCategoria(Model model) {
		model.addAttribute("categoria", new Categoria());
		return "inserisciCategoria.html";
	}
}
