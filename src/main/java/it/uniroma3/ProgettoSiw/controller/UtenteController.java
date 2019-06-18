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

@WebServlet("/utenteController")
public class UtenteController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		//Lettura dei parametri
		HelperUtente helperUtente = new HelperUtente();
		UtenteForm utenteForm = new UtenteForm();
		HttpSession session = request.getSession();
		//Gestione della risposta
		String nextPage;

		if(helperUtente.IsNotValid(request)) {
			nextPage = "/newUtente.jsp";
		}
		else {
			utenteForm.setNome(request.getParameter("nome").toUpperCase());
			utenteForm.setCognome(request.getParameter("cognome").toUpperCase());
			utenteForm.setNascita(request.getParameter("nascita"));
			utenteForm.setEmail(request.getParameter("email"));

			session.setAttribute("utenteForm", utenteForm);
			nextPage = "/rispostaUtente.jsp";

		}
		ServletContext application = getServletContext();
		RequestDispatcher rd;
		rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		return;
	}

}