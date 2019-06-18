package it.uniroma3.ProgettoSiw.storage;

import org.springframework.data.jpa.repository.JpaRepository;
import it.uniroma3.ProgettoSiw.model.Utente;

public interface UtenteRepository extends JpaRepository<Utente, Long> {}