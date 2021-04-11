package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Client;

import Model.ConnexionDB;


public class ConnexionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ConnexionDB conn=new ConnexionDB();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConnexionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String motDePasse=request.getParameter("password");
		
		Client client=conn.getClient(email, motDePasse);
		client.setId(conn.getClientId(email));
		
		if(client!=null) {
			request.setAttribute("client", client);
			request.getRequestDispatcher("menu.jsp").forward(request, response);
		}
		else {
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
