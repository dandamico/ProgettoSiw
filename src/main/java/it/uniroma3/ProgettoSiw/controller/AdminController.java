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

import it.uniroma3.ProgettoSiw.model.Admin;
import it.uniroma3.ProgettoSiw.service.AdminServices;
import it.uniroma3.ProgettoSiw.service.AdminValidator;


@Controller
public class AdminController {

	@Autowired
	private AdminValidator adminValidator;

	@Autowired
	private AdminServices adminService;

	public String newAdmin(@Valid @ModelAttribute("admin") Admin admin,Model model, BindingResult bindingResult) {
		this.adminValidator.validate(admin, bindingResult);

		if(!bindingResult.hasErrors()) {
			this.adminService.inserisci(admin);
			model.addAttribute("funzionario", this.adminService.adminPerId(admin.getId()));
			return this.getAdmin(admin.getId(), model);

		} else {
			return "signupAdmin.html";
		}
	}

	//il valore che ci aspettiamo nel parametro id è quello specifico contenuto in value
	@RequestMapping(value = "/admin/{id}", method = RequestMethod.GET)
	public String getAdmin(@PathVariable ("id") Long id, Model model) {
		if(id != null) {
			model.addAttribute("admin", this.adminService.adminPerId(id));
			return "admin.html"; 
		} else {

			model.addAttribute("admins", this.adminService.tutti());
			return "admins.html"; 
		}
	}
	}
