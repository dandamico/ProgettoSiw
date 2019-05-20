package controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Studente;
import services.StudenteServices;



@WebServlet("/studenteController")
public class StudenteController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		//Lettura dei parametri

		HelperStudente helperstudente = new HelperStudente();
		StudenteForm studenteForm = new StudenteForm();
		HttpSession session = request.getSession();
		//Gestione della risposta
		String nextPage;

		if(helperstudente.IsNotValid(request)) {
			nextPage = "/newStudente.jsp";

		}
		else {
			studenteForm.setNome(request.getParameter("nome").toUpperCase());
			studenteForm.setCognome(request.getParameter("cognome").toUpperCase());
			session.setAttribute("studenteForm", studenteForm);
			nextPage = "/risposta.jsp";

		}
		ServletContext application = getServletContext();
		RequestDispatcher rd;
		rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		return;

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		String nextPage = "/studenti.jsp";
		StudenteServices studenteServices = new StudenteServices();
		
		if(request.getParameter("id") != null) {
			Long idStudente = Long.parseLong(request.getParameter("id"));
			Studente studente = studenteServices.studenteById(idStudente);
			request.setAttribute("studente", studente);
			nextPage = "/studente.jsp";
		}
		else {
			List<Studente> studenti = studenteServices.listaStudenti();
			request.setAttribute("studenti", studenti);
		}
	
		ServletContext application = getServletContext();
		RequestDispatcher rd;
		rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}


}




