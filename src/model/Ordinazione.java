package model;

import java.util.List;

public class Ordinazione {
	
	private Long id;
	private List<RigaOrdinazione> righeOrdinazione;
	private float prezzoParziale;
	
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