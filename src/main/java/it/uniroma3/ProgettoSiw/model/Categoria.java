package it.uniroma3.ProgettoSiw.model;

<<<<<<< HEAD
=======

>>>>>>> origin/Daniele
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	String nome;
	
	
	
	@OneToMany
	private Map<Long, Prodotto> prodotti;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Map<Long, Prodotto> getProdotti() {
		return prodotti;
	}
	public void setProdotti(Map<Long, Prodotto> prodotti) {
		this.prodotti = prodotti;
	}

	
	
}
