package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Article;
import Model.ConnexionDB;

public class ArticleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ConnexionDB conn=new ConnexionDB();
       
    public ArticleController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int codeArticle = Integer.parseInt(request.getParameter("link"));
		int client_id=Integer.parseInt(request.getParameter("client"));
		Article article = conn.getArticleById(codeArticle);
		request.setAttribute("article", article);
		request.setAttribute("client", client_id);
		
		
		request.getRequestDispatcher("article.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
