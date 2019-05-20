package services;

import java.util.ArrayList;
import java.util.List;

import model.Studente;

public class StudenteServices {
	
	private List<Studente> studenti;

	public StudenteServices() {
		
		this.studenti = new ArrayList<>();
		Studente s1 = new Studente();
		s1.setId(1l);
		s1.setNome("Federico");
		s1.setCognome("Giuliana");
		studenti.add(s1);
		
		Studente s2 = new Studente();
		s2.setId(2l);
		s2.setNome("Daniele");
		s2.setCognome("Software");
		studenti.add(s2);
		
		Studente s3 = new Studente();
		s3.setId(3l);
		s3.setNome("Andrea");
		s3.setCognome("Mazinga");
		studenti.add(s3);
		
	}
	
	public void salvaStudente(Studente studente) {
		//TODO 
	}
	
	public List<Studente> listaStudenti(){
		
		return this.studenti;
	}
	
	public Studente studenteById(Long id) {
		Studente studente = null;
		for(Studente s: studenti) {
			if(s.getId().equals(id))
				studente = s;
		}
		return studente;
	}

}
