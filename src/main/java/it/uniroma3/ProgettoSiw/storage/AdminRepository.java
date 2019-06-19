package it.uniroma3.ProgettoSiw.storage;

import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepository extends JpaRepository<Admin, Long> {
	
	//findByDatiDaRecuperare (sarebbero le variabili nel db)
		public List<Admin> findByNome(String nome);
		public List<Admin> findByNomeAndCognome(String nome, String cognome);
	}