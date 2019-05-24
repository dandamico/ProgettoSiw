package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/prodottoController")
public class ProdottoController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Lettura dei parametri
		ProdottoValido prodottoNonValido = new ProdottoValido();
		ProdottoForm prodottoForm = new ProdottoForm();
		HttpSession session =  request.getSession();
			
		//Gestione risposta
		String nextPage;
		
		if(prodottoNonValido.NoValido(request)) {		//Se risulta True "NoValido" i dati inseriti non sono validi, quindi torna alla form del prodotto
			nextPage = "/newProdotto";
		}
		
		else {
			prodottoForm.setNome(request.getParameter("nome").toUpperCase());
			prodottoForm.setDescrizione(request.getParameter("descrizione"));
			session.setAttribute("prodottoForm", prodottoForm);
			nextPage="/rispostaProdotto";			//--------da fare 
		}
		
		
	}
	
	
}
