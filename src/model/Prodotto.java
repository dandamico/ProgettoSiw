package model;

public class Prodotto {
	
	private Long id;
	private String nome;
	private String descrizione;
	private float prezzo;
	
	private Fornitore fornitore;
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
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
}