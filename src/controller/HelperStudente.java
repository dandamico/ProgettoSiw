package controller;

import javax.servlet.http.HttpServletRequest;

public class HelperStudente {

	public boolean IsNotValid(HttpServletRequest request) {

		String nome = request.getParameter("nome").toUpperCase().trim();   //trim() elimina gli spazi all'inizio e alla fine
		String cognome = request.getParameter("cognome").toUpperCase().trim();

		boolean errore = false;

		if(nome.isEmpty()) {
			String  mess = "Il nome è un campo obbligatorio";
			request.setAttribute("nomeErr", mess );  //Passo alla form il messaggio di errore
			errore = true;
		}

		if(cognome.isEmpty()) {
			String  mess = "Il cognome è un campo obbligatorio";
			request.setAttribute("cognomeErr", mess );  //Passo alla form il messaggio di errore
			errore = true;
		}

		return errore;

	}

}


