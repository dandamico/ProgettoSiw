package controller;

import javax.servlet.http.HttpServletRequest;

public class HelperUtente {
	public boolean IsNotValid(HttpServletRequest request) {

		String nome = request.getParameter("nome").toUpperCase().trim();  			 //trim() elimina gli spazi all'inizio e alla fine
		String cognome = request.getParameter("cognome").toUpperCase().trim();
		String nascita = request.getParameter("nascita").trim();
		String email = request.getParameter("email").trim();

		boolean errore = false;

		if(nome.isEmpty()) {
			String  mess = "*campo obbligatorio";
			request.setAttribute("nomeErr", mess );  //Passo alla form il messaggio di errore
			errore = true;
		}
		if(cognome.isEmpty()) {
			String  mess = "*campo obbligatorio";
			request.setAttribute("cognomeErr", mess );  //Passo alla form il messaggio di errore
			errore = true;
		}
		if(nascita.isEmpty()) {
			String  mess = "*campo obbligatorio";
			request.setAttribute("nascitaErr", mess );  //Passo alla form il messaggio di errore
			errore = true;
		}
		if(email.isEmpty()) {
			String  mess = "*campo obbligatorio";
			request.setAttribute("emailErr", mess );  //Passo alla form il messaggio di errore
			errore = true;
		}
		return errore;
	}

}