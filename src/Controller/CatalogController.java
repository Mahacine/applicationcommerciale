package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.ConnexionDB;
import Model.Article;


public class CatalogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ConnexionDB conn=new ConnexionDB();
	
    public CatalogController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String categorie = request.getParameter("categorie");
		int client_id=Integer.parseInt(request.getParameter("client"));
		
		if(categorie==null) {
			categorie="jazz";
		}
		
		List<Article> articles = conn.getArticles(categorie);
		request.setAttribute("articles", articles);
		request.setAttribute("cat", categorie);
		request.setAttribute("client_id", client_id);
		
		request.getRequestDispatcher("catalogue.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
