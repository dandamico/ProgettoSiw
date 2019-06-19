package it.uniroma3.ProgettoSiw.storage;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.ProgettoSiw.model.Admin;
import it.uniroma3.ProgettoSiw.model.Utente;


/**
 * This interface is a JpaRepository for storage operations on Users.
 *
 * @see Utente
 */

public interface AdminRepository extends CrudRepository<Admin, Long> {
	
	//findByDatiDaRecuperare (sarebbero le variabili nel db)
		public List<Admin> findByNome(String nome);
		public List<Admin> findByNomeAndCognome(String nome, String cognome);
	}
