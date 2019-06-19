package it.uniroma3.ProgettoSiw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.ProgettoSiw.storage.AdminRepository;



@Service
public class AdminServices {

	@Autowired 
	private AdminRepository adminRepository;
	
	@Transactional
	public Admin inserisci(Admin admin) {
		return adminRepository.save(admin);
	}

	@Transactional
	public List<Admin> elencoAdmin() {
		return (List<Admin>) adminRepository.findAll();
	}

	public Admin adminPerId(Long id) {
		return this.adminRepository.findById(id).get();
	}
}