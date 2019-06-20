package it.uniroma3.ProgettoSiw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.ProgettoSiw.model.Admin;
import it.uniroma3.ProgettoSiw.service.CategoriaServices;
import it.uniroma3.ProgettoSiw.service.FornitoreServices;
import it.uniroma3.ProgettoSiw.service.ProdottoServices;



@Controller
public class MainController {

	@Autowired
	private FornitoreServices fornitoreService;
	
	@Autowired
	private ProdottoServices prodottoService;

	@Autowired
	private CategoriaServices categoriaService;
	
	@RequestMapping(value = "/addAdmin", method = RequestMethod.GET)
	public String addAdmin(Model model) {
		model.addAttribute("admin", new Admin());
		return "signupAdmin.html";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginAdmin(Model model) {
		model.addAttribute("admin", new Admin());
		return "login.html";
	}
	
	@RequestMapping(value = "/visualizzaFornitori", method = RequestMethod.GET)
	public String visualizzaFornitori(Model model) {
		model.addAttribute("fornitori", this.fornitoreService.tutti());
		return "fornitori.html";
	}
	
	@RequestMapping(value = "/visualizzaProdotti", method = RequestMethod.GET)
	public String visualizzaProdotti(Model model) {
		model.addAttribute("prodotti", this.prodottoService.tutti());
		return "prodotti.html";
	}
	
	@RequestMapping(value = "/visualizzaCategorie", method = RequestMethod.GET)
	public String visualizzaCategoria(Model model) {
		model.addAttribute("categorie", this.categoriaService.tutti());
		return "categorie.html";
	}
}
