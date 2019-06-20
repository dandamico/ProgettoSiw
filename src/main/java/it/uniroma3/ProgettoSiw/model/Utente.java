package it.uniroma3.ProgettoSiw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Utente {


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

	/**
	 * Constructor
	 *
	 * @param id The id of this User
	 * @param firstName The first name of this User
	 * @param lastName The last name of this User
	 * @param username The username of this User for authentication
	 * @param password The password of this User for authentication
	 * @param role The authorization role for this User
	 */
	public Utente(Long id, String nome, String cognome, String username, String password, String ruolo) {

		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.ruolo = ruolo;
	}

	public Utente() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return nome;
	}

	public void setFirstName(String firstName) {
		this.nome = firstName;
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

	public void setRole(String ruolo) {
		this.ruolo = ruolo;
	}
}
