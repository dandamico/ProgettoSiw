package it.uniroma3.ProgettoSiw.controller;

import java.io.IOException;
//import java.util.List;
import java.util.List;

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

@WebServlet("/prodottoController")
public class ProdottoController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Lettura dei parametri
		HelperProdotto helperProdotto = new HelperProdotto();
		ProdottoForm prodottoForm = new ProdottoForm();
		HttpSession session =  request.getSession();

		//Gestione risposta
		String nextPage;

		if(helperProdotto.NoValido(request)) {		//Se risulta True "NoValido" i dati inseriti non sono validi, quindi torna alla form del prodotto
			nextPage = "/newProdotto.jsp";
		}

		else {
			prodottoForm.setNome(request.getParameter("nome").toUpperCase());
			prodottoForm.setDescrizione(request.getParameter("descrizione"));
			prodottoForm.setPrezzo(request.getParameter("prezzo"));
			session.setAttribute("prodottoForm", prodottoForm);
			nextPage="/rispostaProdotto.jsp";			
		}
		ServletContext application = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		return;
	}


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nextPage = "/prodotti.jsp";
		ProdottoService prodottoService = new ProdottoService();

		if(request.getParameter("id")!= null) {
			Long idProdotto = Long.parseLong(request.getParameter("id"));
			Prodotto prodotto = prodottoService.prodottoById(idProdotto);
			request.setAttribute("prodotto",prodotto);
			nextPage="/prodotto.jsp";
		}
		else {
			List<Prodotto> prodotti = prodottoService.listaProdotti();
			request.setAttribute("prodotti", prodotti);
		}
		ServletContext application = getServletContext();
		RequestDispatcher rd;
		rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}
}