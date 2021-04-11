package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Client;
import Model.ConnexionDB;

public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ConnexionDB conn=new ConnexionDB();
    
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String adresse=request.getParameter("adresse");
		int codePostal=Integer.parseInt(request.getParameter("codepostal"));
		String ville=request.getParameter("ville");
		String tel=request.getParameter("tel");
		String motDePasse=request.getParameter("password");
		
		conn.inscrireClient(email, nom, prenom, adresse, codePostal, ville, tel, motDePasse);
		
		Client client=new Client(email,nom,prenom,adresse,codePostal,ville,tel,motDePasse);
		client.setId(conn.getClientId(email));
		request.setAttribute("client", client);
		
		
		request.getRequestDispatcher("menu.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
