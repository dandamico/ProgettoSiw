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

import it.uniroma3.ProgettoSiw.model.Fornitore;
import it.uniroma3.ProgettoSiw.service.FornitoreServices;
import it.uniroma3.ProgettoSiw.service.FornitoreValidator;



@Controller
public class FornitoreController {

	@Autowired
	private FornitoreValidator fornitoreValidator;		//crea classe

	@Autowired
	private FornitoreServices fornitoreService;			//crea classe

	@RequestMapping(value = "/fornitore", method = RequestMethod.POST)			//crea html
	public String newFornitore(@Valid @ModelAttribute("Fornitore") Fornitore fornitore,
			Model model, BindingResult bindingResult) {
		this.fornitoreValidator.validate(fornitore, bindingResult);

		if(!bindingResult.hasErrors()) {
			this.fornitoreService.inserisci(fornitore);
			model.addAttribute("fornitori", this.fornitoreService.tutti());		//crea html
			return "fornitori.html";
		} else {
			return "inserisciFornitore.html";
		}
	}

	//il valore che ci aspettiamo nel parametro id è quello specifico contenuto in value
	@RequestMapping(value = "/fornitore/{id}", method = RequestMethod.GET)
	public String getFornitore(@PathVariable ("id") Long id, Model model) {
		if(id != null) {
			model.addAttribute("fornitore", this.fornitoreService.fornitorePerId(id));
			return "fornitore.html"; 
		} else {
			model.addAttribute("fornitori", this.fornitoreService.tutti());
			return "fornitori.html"; 
		}
	}
	
	@RequestMapping("/addFornitore")
	public String addFornitore(Model model) {
		model.addAttribute("fornitore", new Fornitore());
		return "inserisciFornitore.html";
	}
}
