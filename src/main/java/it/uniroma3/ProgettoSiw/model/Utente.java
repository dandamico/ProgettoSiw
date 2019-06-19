package it.uniroma3.ProgettoSiw.model;

import javax.persistence.*;

/**
 * A User is a generic person who can use our application.
 * Subclasses of User include Admin and Customer.
 * @see User
 */
@Entity
@Table(name = "utenti")
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", columnDefinition = "serial", nullable = false)
	protected Long id;


	@Column(name = "nome")
	protected String nome;


	@Column(name = "cognome")
	protected String cognome;

	@Column(name = "username", unique=true)
	protected String username;


	@Column(name = "password")
	protected String password;


	@Column(name = "role")
	protected String role;

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
	public Utente(Long id, String nome, String cognome, String username, String password, String role) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.role = role;
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

	public String getLastName() {
		return cognome;
	}


	public void setLastName(String lastName) {
		this.cognome = lastName;
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


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
}
