package it.uniroma3.ProgettoSiw;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import it.uniroma3.ProgettoSiw.model.Admin;
import it.uniroma3.ProgettoSiw.storage.AdminRepository;

@Component
public class DBPopulation implements ApplicationRunner {

	@Autowired
	private AdminRepository adminRepository;


	public void run(ApplicationArguments args) throws Exception {
		this.deleteAll();
		this.populateDB();
	}

	private void deleteAll() {
		System.out.println("Deleting all users from DB...");
		adminRepository.deleteAll();
		System.out.println("Done");
	}

	private void populateDB() throws IOException, InterruptedException {

		System.out.println("Storing users...");


		Admin admin = new Admin(1L, "FEDERICO", "CICERO", "BUSINESS", "ADMIN");
		String adminPassword = new BCryptPasswordEncoder().encode("mrpass");
		admin.setPassword(adminPassword);
		admin = this.adminRepository.save(admin);

	}
}
