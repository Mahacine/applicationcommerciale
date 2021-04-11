package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.ConnexionDB;


public class ChartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ConnexionDB conn=new ConnexionDB();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChartController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			int client_id=Integer.parseInt(request.getParameter("client"));
			if(request.getParameter("product")!=null) {
				conn.addToChart(client_id,request.getParameter("product"));
			}
			List<String> panier=conn.getPanier(client_id);
			request.setAttribute("panier", panier);
			request.getRequestDispatcher("panier.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
