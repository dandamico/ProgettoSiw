package it.uniroma3.ProgettoSiw.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping(value = "/admin", method = RequestMethod.POST)
	public String newAdmin(@Valid @ModelAttribute("admin") Admin admin,
			Model model, BindingResult bindingResult) {
		this.adminValidator.validate(admin, bindingResult);

		if(!bindingResult.hasErrors()) {
			this.adminService.inserisci(admin);
			model.addAttribute("admin", this.adminService.adminPerId(admin.getId()));
			return "admin.html";
			//			return this.getFunzionario(funz.getId(), model);
		} else {
			return "signupAdmin.html";
		}
	}



	@RequestMapping(value = "/admin/{id}", method = RequestMethod.POST)
	public String loginAdmin(@Valid @ModelAttribute("admin") Admin admin, 
			Model model, BindingResult bindingResult) {
		this.adminValidator.validate(admin, bindingResult);
		if(!bindingResult.hasErrors()) {
			Admin adminInMemoria = this.adminService.adminPerUsername(admin.getUsername());
			if((adminInMemoria!=null)&&(admin.checkPassword(adminInMemoria))) {
				model.addAttribute("admin", adminInMemoria);
				return "admin.html";
			} else {
				return "login.html"; 
			}
		}
		else return "login.html";
	}
}
