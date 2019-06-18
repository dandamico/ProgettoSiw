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
 
@WebServlet("/adminController")
public class AdminController extends HttpServlet {
 
    private static final long serialVersionUID = 1L;
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
 
        //Lettura dei parametri
 
        HelperAdmin helperadmin = new HelperAdmin();
        AdminForm adminForm = new AdminForm();
        HttpSession session = request.getSession();
        //Gestione della risposta
        String nextPage;
 
        if(helperadmin.IsNotValid(request)) {
            nextPage = "/newAdmin.jsp";
        }
        else {
            adminForm.setNome(request.getParameter("email").toUpperCase());
            adminForm.setCognome(request.getParameter("password").toUpperCase());
            session.setAttribute("AdminForm", adminForm);
            nextPage = "/rispostaadmin.jsp";
        }
        ServletContext application = getServletContext();
        RequestDispatcher rd;
        rd = application.getRequestDispatcher(nextPage);
        rd.forward(request, response);
        return;
    }

}