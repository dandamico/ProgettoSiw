package it.uniroma3.ProgettoSiw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import it.uniroma3.ProgettoSiw.model.Utente;
import it.uniroma3.ProgettoSiw.storage.UtenteRepository;
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
        System.out.println("Elimina tutti gli utenti dal DB.");
        utenteRepository.deleteAll();
        System.out.println("Fatto");
    }

    private void populateDB() throws IOException, InterruptedException {

        System.out.println("Utenti memorizzati:");

        Utente admin = new Utente(1L, "Mario", "Rossi", "mariorossi", null, "ADMIN");
        String adminPassword = new BCryptPasswordEncoder().encode("mrpass");
        admin.setPassword(adminPassword);
        admin = this.utenteRepository.save(admin);

        System.out.println("Fatto.\n");
    }
}
