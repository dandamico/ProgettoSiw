package it.uniroma3.ProgettoSiw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.ProgettoSiw.model.Admin;
import it.uniroma3.ProgettoSiw.repository.AdminRepository;


@Service
public class AdminServices {

	@Autowired //crea da solo l'oggetto e assegnalo alla variabile
	private AdminRepository adminrepository;
	
	@Transactional
	public Admin inserisci(Admin admin) {
		admin.setRole("ADMIN");
		return adminrepository.save(admin);
	}

	@Transactional
	public List<Admin> tutti() {
		return (List<Admin>) adminrepository.findAll();
	}

	@Transactional
	public Admin adminPerId(Long id) {
		return this.adminrepository.findById(id).get();
	}
	
	@Transactional
	public Admin adminPerUsername(String username) {
		return this.adminrepository.findByUsername(username);
	}
}