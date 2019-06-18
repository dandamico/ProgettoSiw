package it.uniroma3.ProgettoSiw.controller;

import javax.servlet.http.HttpServletRequest;

public class HelperAdmin {

	public boolean IsNotValid(HttpServletRequest request) {

		String email = request.getParameter("email").toUpperCase().trim();   //trim() elimina gli spazi all'inizio e alla fine
		String password = request.getParameter("password").toUpperCase().trim();
		String email1="federico.giuliana@gmail.com";
		String pass="1234";

		boolean errore = false;

		if(email.isEmpty()) {
			String  mess = "L'email un campo obbligatorio";
			request.setAttribute("emailErr", mess );  //Passo alla form il messaggio di errore
			errore = true;
		}
		if(email.equals(email1)) {
			if(password.equals(pass)) {
				
			}
		}

		if(password.isEmpty()) {
			String  mess = "La password un campo obbligatorio";
			request.setAttribute("passErr", mess );  //Passo alla form il messaggio di errore
			errore = true;
		}

		return errore;

	}

}


