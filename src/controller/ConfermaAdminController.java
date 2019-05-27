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

import model.Admin;


@WebServlet("/confermaadmin")
public class ConfermaAdminController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		HttpSession session = request.getSession();
		
		Admin admin = new Admin();
		AdminForm adminForm = (AdminForm) session.getAttribute("adminForm");
		admin.setNome(adminForm.getNome());
		admin.setCognome(adminForm.getCognome());
		

		//Gestione della risposta
		ServletContext application = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher("/fineadmin.jsp");
		rd.forward(request, response);
		return;

	}


}
