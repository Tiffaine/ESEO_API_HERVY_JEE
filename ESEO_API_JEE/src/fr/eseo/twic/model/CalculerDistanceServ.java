package fr.eseo.twic.model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CalculerDistanceServ
 */
@WebServlet("/CalculerDistanceServ")
public class CalculerDistanceServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculerDistanceServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ville1 = request.getParameter("selectVille1");
		String ville2 = request.getParameter("selectVille2");

		System.out.println("ville1 coucou"+ville1);
		System.out.println("ville2 coucou"+ville2);
		HttpSession session = request.getSession(); 
		session.setAttribute("ville1", ville1);
		session.setAttribute("ville2", ville2);
		
		RequestDispatcher dispat = request.getRequestDispatcher("affichageData.jsp");
		dispat.forward(request, response);
	}

}
