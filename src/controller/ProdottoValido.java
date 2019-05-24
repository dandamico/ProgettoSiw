package controller;

import javax.servlet.http.HttpServletRequest;

public class ProdottoValido {
	
	
	public boolean NoValido(HttpServletRequest request) {

		String nome = request.getParameter("nome").toUpperCase().trim();   //trim() elimina gli spazi all'inizio e alla fine
		String descrizione = request.getParameter("descirzione");
		String prezzo = request.getParameter("prezzo");

		boolean errore = false;

		if(nome.isEmpty()) {
			String  mess = "Il nome e' un campo obbligatorio";
			request.setAttribute("nomeErr", mess );  //Passo alla form il messaggio di errore
			errore = true;
		}


		if(descrizione.isEmpty()) {
			String  mess = "La descrizione e' un campo obbligatorio";
			request.setAttribute("descErr", mess );  //Passo alla form il messaggio di errore
			errore = true;
		}
		
		if(prezzo.isEmpty()) {
			String  mess = "Il prezzo e' un campo obbligatorio";
			request.setAttribute("prezzoErr", mess );  //Passo alla form il messaggio di errore
			errore = true;
		}
		
		
		return errore;

	}
}
