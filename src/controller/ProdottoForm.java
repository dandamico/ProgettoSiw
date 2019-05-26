package controller;

public class ProdottoForm {
	private Long id;
	private String nome;
	private String descrizione;
	private String prezzo;
	
	
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
