package it.uniroma3.ProgettoSiw.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma3.ProgettoSiw.model.Prodotto;
import it.uniroma3.ProgettoSiw.service.ProdottoService;

@WebServlet("/confermaProdotto")
public class ConfermaProdotto extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();			//crea sessione
		
		Prodotto prodotto = new Prodotto();					//crea prodotto
		ProdottoForm prodottoForm = (ProdottoForm) session.getAttribute("prodottoForm");		//form del prodotto=la form della sessione corrente
		//inizializzo i dati
		prodotto.setNome(prodottoForm.getNome());
		prodotto.setDescrizione(prodottoForm.getDescrizione());
		prodotto.setPrezzo(prodottoForm.getPrezzo());
		
		ProdottoService prodottoService = new ProdottoService();			//richiamo i servizi di prodotto
		prodottoService.salvaProdotto(prodotto);							//salvo il nuovo prodotto
		
		
		//Gestione della risposta
		ServletContext application = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher("/fineProdotto.jsp");
		rd.forward(request, response);
		return;
	}
}
