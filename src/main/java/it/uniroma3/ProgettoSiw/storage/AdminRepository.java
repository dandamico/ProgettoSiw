package it.uniroma3.ProgettoSiw.storage;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.uniroma3.ProgettoSiw.model.Admin;
import it.uniroma3.ProgettoSiw.model.Utente;
import progettosilph.model.Funzionario;

/**
 * This interface is a JpaRepository for storage operations on Users.
 *
 * @see Utente
 */
<<<<<<< HEAD:src/main/java/it/uniroma3/ProgettoSiw/storage/UtenteRepository.java
public interface AmministratoreRepository extends JpaRepository<Amministratore, Long> {
	
	//findByDatiDaRecuperare (sarebbero le variabili nel db)
		public List<Amministratore> findByNome(String nome);
		public List<Amministratore> findByNomeAndCognome(String nome, String cognome);
	}
=======
public interface AdminRepository extends JpaRepository<Admin, Long> {}
>>>>>>> origin/Zio:src/main/java/it/uniroma3/ProgettoSiw/storage/AdminRepository.java
