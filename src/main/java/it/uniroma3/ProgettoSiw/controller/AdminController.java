package it.uniroma3.ProgettoSiw.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
=======
>>>>>>> origin/Zio
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

<<<<<<< HEAD
import it.uniroma3.ProgettoSiw.service.AdminServices;
import it.uniroma3.ProgettoSiw.service.AdminValidator;


=======
import it.uniroma3.ProgettoSiw.model.Admin;
import it.uniroma3.ProgettoSiw.service.AdminServices;
import it.uniroma3.ProgettoSiw.service.AdminValidator;

>>>>>>> origin/Zio
@Controller
public class AdminController {

	@Autowired
	private AdminValidator adminValidator;

	@Autowired
	private AdminServices adminService;

	@RequestMapping(value = "/admin", method = RequestMethod.POST)
<<<<<<< HEAD
	public String newAdmin(@Valid @ModelAttribute("admin") Admin admin,Model model, BindingResult bindingResult) {
		this.adminValidator.validate(admin, bindingResult);
		if(!bindingResult.hasErrors()) {
			this.adminService.inserisci(admin);
			model.addAttribute("admins", this.adminService.elencoAdmin());
			return "admins.html";
=======
	public String newAdmin(@Valid @ModelAttribute("admin") Admin admin,
			Model model, BindingResult bindingResult) {
		this.adminValidator.validate(admin, bindingResult);

		if(!bindingResult.hasErrors()) {
			this.adminService.inserisci(admin);
			model.addAttribute("admin", this.adminService.adminPerId(admin.getId()));
			return this.getAdmin(admin.getId(), model);
>>>>>>> origin/Zio
		} else {
			return "signupAdmin.html";
		}
	}

	//il valore che ci aspettiamo nel parametro id è quello specifico contenuto in value
	@RequestMapping(value = "/admin/{id}", method = RequestMethod.GET)
<<<<<<< HEAD
	public String getFunzionario(@PathVariable ("id") Long id, Model model) {
=======
	public String getAdmin(@PathVariable ("id") Long id, Model model) {
>>>>>>> origin/Zio
		if(id != null) {
			model.addAttribute("admin", this.adminService.adminPerId(id));
			return "admin.html"; 
		} else {
<<<<<<< HEAD
			model.addAttribute("admins", this.adminService.elencoAdmin());
			return "admins.html"; 
		}
	}

=======
			model.addAttribute("admins", this.adminService.tutti());
			return "admins.html"; 
		}
	}
	
>>>>>>> origin/Zio
}
