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

import it.uniroma3.ProgettoSiw.model.Prodotto;
import it.uniroma3.ProgettoSiw.service.ProdottoServices;
import it.uniroma3.ProgettoSiw.service.ProdottoValidator;

@Controller
public class ProdottoController {

	@Autowired
	private  ProdottoValidator  prodottoValidator;

	@Autowired
	private ProdottoServices prodottoService;

	@RequestMapping(value = "/prodotto", method = RequestMethod.POST)
	public String newProdotto(@Valid @ModelAttribute("Prodotto") Prodotto prodotto,
			Model model, BindingResult bindingResult) {
		this.prodottoValidator.validate(prodotto, bindingResult);

		if(!bindingResult.hasErrors()) {
			this.prodottoService.inserisci(prodotto);
			model.addAttribute("categoria", this.prodottoService.tutti());
			return "categoria.html";
		} else {
			return "inserisciProdotto.html";
		}
	}

	//il valore che ci aspettiamo nel parametro id è quello specifico contenuto in value
	@RequestMapping(value = "/prodotto/{id}", method = RequestMethod.GET)
	public String getprodotto(@PathVariable ("id") Long id, Model model) {
		if(id != null) {
			model.addAttribute("prodotto", this.prodottoService.prodottoPerId(id));
			return "prodotto.html"; 
		} else {
			model.addAttribute("fornitori", this.prodottoService.tutti());
			return "categoria.html"; 
		}
	}
	
	@RequestMapping("/addProdotto")
	public String addFotografia(Model model) {
		model.addAttribute("prodotto", new Prodotto());
		return "inserisciProdotto.html";
	}
}
