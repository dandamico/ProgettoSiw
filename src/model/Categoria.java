package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categoria {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long iidd;
	
	@Column(nullable=false)
	private String nomne;
	
	@OneToMany(mappedBy="categoriaProdotto")
	private List<Prodotto> prodotti;

	public String getNome() {
		return nomne;
	}
	public void setNome(String nome) {
		this.nomne = nome;
	}
	public Long getId() {
		return iidd;
	}
	public void setId(Long id) {
		this.iidd = id;
	}
	public List<Prodotto> getProdotti() {
		return prodotti;
	}
	public void setProdotti(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}
	
}
