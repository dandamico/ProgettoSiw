package it.uniroma3.ProgettoSiw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

<<<<<<< HEAD
import it.uniroma3.ProgettoSiw.storage.AdminRepository;


=======
import it.uniroma3.ProgettoSiw.model.Admin;
import it.uniroma3.ProgettoSiw.storage.AdminRepository;
>>>>>>> origin/Zio

@Service
public class AdminServices {

<<<<<<< HEAD
	@Autowired 
	private AdminRepository adminRepository;
=======
	@Autowired //crea da solo l'oggetto e assegnalo alla variabile
	private AdminRepository  adminRepository;
>>>>>>> origin/Zio
	
	@Transactional
	public Admin inserisci(Admin admin) {
		return adminRepository.save(admin);
	}

	@Transactional
<<<<<<< HEAD
	public List<Admin> elencoAdmin() {
=======
	public List<Admin> tutti() {
>>>>>>> origin/Zio
		return (List<Admin>) adminRepository.findAll();
	}

	public Admin adminPerId(Long id) {
		return this.adminRepository.findById(id).get();
	}
}