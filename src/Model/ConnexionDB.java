package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnexionDB {
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private PreparedStatement pstmt;
	
	
	public ConnexionDB() {
		 try{
	         Class.forName("com.mysql.jdbc.Driver");
	         //conn = DriverManager.getConnection("jdbc:mysql://localhost/commerce","root","");
	         conn = DriverManager.getConnection("jdbc:mysql://mysql-26510-0.cloudclusters.net:26510/commerce?autoReconnect=true&tcpKeepAlive=true","mahacine","maha1234");
	         stmt = conn.createStatement();    
	      }
		 catch(SQLException se){
	         se.printStackTrace();
	      }
		 catch(Exception e){
	         e.printStackTrace();
	      }
	}
	
	public void inscrireClient(String email, String nom, String prenom, String adresse, int codePostal, String ville,
			String tel, String motDePasse) {
		String sql="insert into client(email,nom,prenom,adresse,code_postal,ville,tel,motdepasse) values('"+email+"','"+nom+"','"+prenom+"','"+adresse+"','"+codePostal+"','"+ville+"','"+tel+"','"+motDePasse+"')";
		try {
			stmt.executeUpdate(sql);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void addToChart(int clientId,String designation) {
		String sql="insert into panier(designation,client_id) values('"+designation+"',"+clientId+")";
		try {
			stmt.executeUpdate(sql);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<String> getPanier(int clientId){
		
		List<String> panier=new ArrayList<String>();
		try{
	         pstmt= conn.prepareStatement("select * from panier where client_id=?");
	         pstmt.setInt(1,clientId);
	         rs=pstmt.executeQuery();
	         // Extract data from result set
	         while(rs.next()){
	           panier.add(rs.getString("designation"));
	         }
	         rs.close();
	      }catch(SQLException se){
	         //Handle errors for JDBC
	         se.printStackTrace();
	      }catch(Exception e){
	         //Handle errors for Class.forName
	         e.printStackTrace();
	      }
		return panier;
	}
	
	public int getClientId(String email) {
		int id=1;
		try{
	         pstmt= conn.prepareStatement("select * from client where email=?");
	         pstmt.setString(1,email);
	         rs=pstmt.executeQuery();
	         // Extract data from result set
	         while(rs.next()){
	           id=rs.getInt("id");
	         }
	         rs.close();
	      }catch(SQLException se){
	         //Handle errors for JDBC
	         se.printStackTrace();
	      }catch(Exception e){
	         //Handle errors for Class.forName
	         e.printStackTrace();
	      }
		return id;
		
	}
	public Client getClient(String email,String motDePasse) {
		Client client=null; 
		try{
	         pstmt= conn.prepareStatement("select * from client where email=? and motdepasse=?");
	         pstmt.setString(1,email);
	         pstmt.setString(2, motDePasse);
	         rs=pstmt.executeQuery();
	         // Extract data from result set
	         if(rs.next()){
	            //Retrieve by column name
	            String nom = rs.getString("nom");
	            String prenom = rs.getString("prenom");
	            String ville= rs.getString("ville");
	            int codePostal= rs.getInt("code_postal");
	            String tel= rs.getString("tel");
	            String adresse= rs.getString("adresse");
	            client=new Client(email,nom,prenom,adresse,codePostal,ville,tel,motDePasse);
	         }
	         rs.close();
	      }catch(SQLException se){
	         //Handle errors for JDBC
	         se.printStackTrace();
	      }catch(Exception e){
	         //Handle errors for Class.forName
	         e.printStackTrace();
	      }
		return client;
	}

	public List<Article> getArticles(String categorie){
		
		List<Article> articles=new ArrayList<Article>();
		try{
	         pstmt= conn.prepareStatement("select * from article where categorie=?");
	         pstmt.setString(1,categorie);
	         rs=pstmt.executeQuery();
	         // Extract data from result set
	         while(rs.next()){
	            //Retrieve by column name
	        	int codeArticle = rs.getInt("code_article");
	            String designation = rs.getString("designation");
	            double prix = rs.getDouble("prix");
	            String photo= rs.getString("photo");
	            String auteur= rs.getString("auteur");
	            int stock=rs.getInt("stock");
	            Article article=new Article(codeArticle,designation,prix,stock,categorie,photo,auteur);
	            articles.add(article);
	            //System.out.println(article.getDesignation());
	         }
	         rs.close();
	      }catch(SQLException se){
	         //Handle errors for JDBC
	         se.printStackTrace();
	      }catch(Exception e){
	         //Handle errors for Class.forName
	         e.printStackTrace();
	      }
		
		
		return articles;
	}
	
	public Article getArticleById(int codeArticle) {
		
		Article article=null;
		
		try{
	         pstmt= conn.prepareStatement("select * from article where code_article=?");
	         pstmt.setInt(1,codeArticle);
	         rs=pstmt.executeQuery();
	         // Extract data from result set
	         if(rs.next()){
	            //Retrieve by column name
	            String designation = rs.getString("designation");
	            double prix = rs.getDouble("prix");
	            String photo= rs.getString("photo");
	            String auteur= rs.getString("auteur");
	            int stock=rs.getInt("stock");
	            String categorie=rs.getString("categorie");
	            article=new Article(codeArticle,designation,prix,stock,categorie,photo,auteur);
	         }
	         rs.close();
	      }catch(SQLException se){
	         //Handle errors for JDBC
	         se.printStackTrace();
	      }catch(Exception e){
	         //Handle errors for Class.forName
	         e.printStackTrace();
	      }
		
		
		return article;
		
	}
}
