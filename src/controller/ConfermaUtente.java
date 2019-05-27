package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Utente;

@WebServlet("/confermaUtente")
public class ConfermaUtente extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		HttpSession session = request.getSession();

		Utente utente = new Utente();
		UtenteForm utenteForm = (UtenteForm) session.getAttribute("utenteForm");

		utente.setNome(utenteForm.getNome());
		utente.setCognome(utenteForm.getCognome());
		utente.setNascita(utenteForm.getNascita());
		utente.setEmail(utenteForm.getEmail());

		//Gestione della risposta
		ServletContext application = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher("/fineUtente.jsp");
		rd.forward(request, response);
		return;
	}
}
