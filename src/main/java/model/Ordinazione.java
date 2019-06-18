package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ordinazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private float prezzoParziale;

	@OneToMany
	private List<RigaOrdinazione> righeOrdinazione;
	
	@ManyToOne
	private Utente utente;
	
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public float getPrezzoParziale() {
		return prezzoParziale;
	}
	public void setPrezzoParziale(float prezzoParziale) {
		this.prezzoParziale = prezzoParziale;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<RigaOrdinazione> getRigheOrdinazione() {
		return righeOrdinazione;
	}
	public void setRigheOrdinazione(List<RigaOrdinazione> righeOrdinazione) {
		this.righeOrdinazione = righeOrdinazione;
	}	

}