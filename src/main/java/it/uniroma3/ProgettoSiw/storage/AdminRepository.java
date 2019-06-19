package it.uniroma3.ProgettoSiw.storage;

import org.springframework.data.jpa.repository.JpaRepository;

import it.uniroma3.ProgettoSiw.model.Admin;
import it.uniroma3.ProgettoSiw.model.Utente;

/**
 * This interface is a JpaRepository for storage operations on Users.
 *
 * @see Utente
 */
public interface AdminRepository extends JpaRepository<Admin, Long> {}