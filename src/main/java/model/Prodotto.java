package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Prodotto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	@Column(length=2000)
	private String descrizione;
	@Column(nullable=false)
	private String prezzo;
	@Column(nullable = false)
	private int pezziVenduti;
	
	@ManyToOne
	private Fornitore fornitore;
	
	@ManyToOne
	private Categoria categoriaProdotto;

	
	
	public Fornitore getFornitore() {
		return fornitore;
	}
	public void setFornitore(Fornitore fornitore) {
		this.fornitore = fornitore;
	}
	public Categoria getCategoriaProdotto() {
		return categoriaProdotto;
	}
	public void setCategoriaProdotto(Categoria categoriaProdotto) {
		this.categoriaProdotto = categoriaProdotto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}
	
}