package controller;

import javax.servlet.http.HttpServletRequest;

public class HelperProdotto {
	
	
	public boolean NoValido(HttpServletRequest request) {

		String nome = request.getParameter("nome").toUpperCase().trim();   //trim() elimina gli spazi all'inizio e alla fine
		String descrizione = request.getParameter("descrizione");
		String prezzo = request.getParameter("prezzo").trim();

		boolean errore = false;

		if(nome.isEmpty()) {
			String  mess = "*campo obbligatorio";
			request.setAttribute("nomeErr", mess );  //Passo alla form il messaggio di errore
			errore = true;
		}


		if(descrizione.isEmpty()) {
			String  mess = "*campo obbligatorio";
			request.setAttribute("descErr", mess );  //Passo alla form il messaggio di errore
			errore = true;
		}
		
		if(prezzo.isEmpty()) {
			String  mess = "*campo obbligatorio";
			request.setAttribute("prezzoErr", mess );  //Passo alla form il messaggio di errore
			errore = true;
		}
		
		
		return errore;

	}
}
