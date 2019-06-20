package it.uniroma3.ProgettoSiw.storage;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.ProgettoSiw.model.Admin;

public interface AdminRepository extends CrudRepository<Admin, Long> {

	//findByDatiDaRecuperare (sarebbero le variabili nel db)
	public Admin findByUsername(String username);
	public List<Admin> findByUsernameAndPassword(String username, String password);
}
