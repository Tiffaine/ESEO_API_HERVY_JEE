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
 * Servlet implementation class CalculServlet
 */
@WebServlet("/CalculServlet")
public class CalculServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String lat1 = request.getParameter("lat1");
		String lng1 = request.getParameter("lng1");
		String lat2 = request.getParameter("lat2");
		String lng2 = request.getParameter("lng2");

		double lat1Double = Double.parseDouble(lat1);
		double lng1Double = Double.parseDouble(lng1);
		double lat2Double = Double.parseDouble(lat2);
		double lng2Double = Double.parseDouble(lng2);
	
	
		//calcul sur un repere plan 
		double distance = Math.acos(Math.sin(lat1Double)*Math.sin(lat2Double) + Math.cos(lat1Double) * Math.cos(lat2Double)*Math.cos(lng2Double-lng1Double))*6371;

		RequestDispatcher dispat = request.getRequestDispatcher("affichageDistance.jsp"); 
		HttpSession session = request.getSession(); 
		session.setAttribute("distance", distance);
		dispat.forward(request, response);
	}

}
