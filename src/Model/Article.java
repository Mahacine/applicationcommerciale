package Model;

public class Article {
	
	private int codeArticle;
	private String designation;
	private double prix;
	private int stock;
	private String categorie;
	private String cheminImage;
	private String auteur;
	
	
	public Article(int codeArticle, String designation, double prix, int stock, String categorie,
			String cheminImage,String auteur) {
		super();
		this.codeArticle = codeArticle;
		this.designation = designation;
		this.prix = prix;
		this.stock = stock;
		this.categorie = categorie;
		this.cheminImage = cheminImage;
		this.auteur = auteur;
	}
	public int getCodeArticle() {
		return codeArticle;
	}
	public void setCodeArticle(int codeArticle) {
		this.codeArticle = codeArticle;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getCheminImage() {
		return cheminImage;
	}
	public void setCheminImage(String cheminImage) {
		this.cheminImage = cheminImage;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	

}
