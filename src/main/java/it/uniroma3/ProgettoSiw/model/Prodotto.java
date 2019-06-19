package it.uniroma3.ProgettoSiw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prodotto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	String categoria;
	private long idFornitore;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getFornitore() {
		return idFornitore;
	}
	public void setFornitore(long idFornitore) {
		this.idFornitore = idFornitore;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}	
}
