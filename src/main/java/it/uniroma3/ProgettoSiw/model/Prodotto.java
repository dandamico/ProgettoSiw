package it.uniroma3.ProgettoSiw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prodotti")
public class Prodotto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	String nome;
	String prezzo;
	private long idFornitore;
	private long idCategoria;
	
	
	public Prodotto(String nome,String prezzo,Long idForn) {
		this.nome=nome;
		this.prezzo=prezzo;
		this.idFornitore=idForn;
		
	}
	
	public Prodotto() {
		
	}
	public long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}
	public long getIdFornitore() {
		return idFornitore;
	}
	public void setIdFornitore(long idFornitore) {
		this.idFornitore = idFornitore;
	}	
}
