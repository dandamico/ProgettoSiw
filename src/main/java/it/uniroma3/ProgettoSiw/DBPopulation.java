package it.uniroma3.ProgettoSiw;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import it.uniroma3.ProgettoSiw.model.Admin;
import it.uniroma3.ProgettoSiw.model.Categoria;
import it.uniroma3.ProgettoSiw.model.Fornitore;
import it.uniroma3.ProgettoSiw.model.Prodotto;
import it.uniroma3.ProgettoSiw.storage.AdminRepository;
import it.uniroma3.ProgettoSiw.storage.CategoriaRepository;
import it.uniroma3.ProgettoSiw.storage.FornitoreRepository;
import it.uniroma3.ProgettoSiw.storage.ProdottoRepository;





@Component
public class DBPopulation implements ApplicationRunner {

 @Autowired
 private ProdottoRepository prodottoRepository;
 @Autowired
 private FornitoreRepository fornitoreRepository;
 @Autowired
 private AdminRepository adminRepository;
 @Autowired
 private CategoriaRepository categoriaRepository;
 
 
 @Override
 public void run(ApplicationArguments args) throws Exception {
  this.deleteAll();
        this.populateDB();
 }
 
 private void deleteAll() {
        System.out.println("Deleting all users from DB...");
        
        prodottoRepository.deleteAll();
        fornitoreRepository.deleteAll();
        adminRepository.deleteAll();
        System.out.println("Done");
    }
 
 private void populateDB() throws IOException, InterruptedException {

        System.out.println("Storing users...");

        /*inserimento funzionari*/
        Admin a1 = new Admin(1L,"Daniele", "D'Amico", "daniele" ,"ddpass", "ADMIN");
//        String pwd1 = new BCryptPasswordEncoder().encode("dapass");
//        f1.setPassword(pwd1);
        a1 = this.adminRepository.save(a1);

        Admin a2 = new Admin(2L,"Riccardo", "Cicero", "mrCrick", "rcpass", "ADMIN");
//        String pwd2 = new BCryptPasswordEncoder().encode("adspass");
//        f2.setPassword(pwd2);
        a2 = this.adminRepository.save(a2);
        

        
        /*inserimento fotografi */
        Fornitore f1 = new Fornitore("federico", "giuliana");
        f1 = this.fornitoreRepository.save(f1);
        
       

        /*inserimento fotografie*/
        Prodotto p1 = new Prodotto("mela", "1", f1.getId());
        p1 = this.prodottoRepository.save(p1);
        Prodotto p2 = new Prodotto("zenzero", "2", f1.getId());
        p2 = this.prodottoRepository.save(p2);        
        Prodotto p3 = new Prodotto("arancia", "3", f1.getId());
        p3 = this.prodottoRepository.save(p3);        
        Prodotto p4 = new Prodotto("lime", "3", f1.getId());
        p4 = this.prodottoRepository.save(p4);
        
        Categoria c1 = new Categoria("Frutta");
        c1=this.categoriaRepository.save(c1);
        

        

        System.out.println("Done.\n");
    }

}
