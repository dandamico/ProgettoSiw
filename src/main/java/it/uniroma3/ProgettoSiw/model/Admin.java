package it.uniroma3.ProgettoSiw.model;

import javax.persistence.*;

@Entity
@Table(name = "admins")
public class Admin {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", columnDefinition = "serial", nullable = false)
	protected Long id;
	
	@Column(name = "name")
	protected String nome;

	@Column(name = "cognome")
	protected String cognome;

	@Column(name = "username", unique=true)
	protected String username;

	@Column(name = "password")
	protected String password;

	@Column(name = "ruolo")
	protected String ruolo;


	public Admin(Long id, String nome, String cognome, String username, String password, String ruolo) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.ruolo = ruolo;
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


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRuolo() {
		return ruolo;
	}


	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
}
