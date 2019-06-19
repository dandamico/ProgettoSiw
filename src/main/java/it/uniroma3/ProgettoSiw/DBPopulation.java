package it.uniroma3.ProgettoSiw;

import it.uniroma3.ProgettoSiw.model.Utente;
import it.uniroma3.ProgettoSiw.storage.UtenteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class DBPopulation implements ApplicationRunner {

	@Autowired
	private UtenteRepository utenteRepository;


	public void run(ApplicationArguments args) throws Exception {
		this.deleteAll();
		this.populateDB();
	}

	private void deleteAll() {
		System.out.println("Deleting all users from DB...");
		utenteRepository.deleteAll();
		System.out.println("Done");
	}

	private void populateDB() throws IOException, InterruptedException {

		System.out.println("Storing users...");


        Utente admin = new Utente(1L, "Mario", "Rossi", "mariorossi", null, "ADMIN");
        String adminPassword = new BCryptPasswordEncoder().encode("mrpass");
        admin.setPassword(adminPassword);
        admin = this.utenteRepository.save(admin);

	}
}
