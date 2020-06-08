package tp3_pizza;

import java.util.ArrayList;


public class Client extends Personne{

	private Long numeroCarteCredit;
	//on va stocker en mémoire les différentes commandes que le client a pu passer
	private ArrayList<Commande> commandes;
	
	
	public Client(Long numTel, Long numCC, String ad, String nom) {
		super(numTel, ad, nom);
		this.setNumeroCarteCredit(numCC);
		commandes = new ArrayList<Commande>();
	}


	public Long getNumeroCarteCredit() {
		return numeroCarteCredit;
	}


	public void setNumeroCarteCredit(Long numeroCarteCredit) {
		this.numeroCarteCredit = numeroCarteCredit;
	}


	public ArrayList<Commande> getCommandes() {
		return commandes;
	}


	public void setCommandes(ArrayList<Commande> commandes) {
		this.commandes = commandes;
	}

}
