package Model;

import java.util.Date;

public class Commande {
	
	private int numCommande;
	private int codeClient;
	private Date dateCommande;
	
	
	public Commande(int numCommande, int codeClient, Date dateCommande) {
		super();
		this.numCommande = numCommande;
		this.codeClient = codeClient;
		this.dateCommande = dateCommande;
	}
	public int getNumCommande() {
		return numCommande;
	}
	public void setNumCommande(int numCommande) {
		this.numCommande = numCommande;
	}
	public int getCodeClient() {
		return codeClient;
	}
	public void setCodeClient(int codeClient) {
		this.codeClient = codeClient;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	
	

}
