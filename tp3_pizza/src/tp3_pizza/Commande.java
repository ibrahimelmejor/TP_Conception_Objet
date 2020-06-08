package tp3_pizza;

import java.util.Date;

import tp3_pizza.System.états;


public class Commande {
	private Client client;
	private Collaborateur collaborateur;
	private Date datelivraisonDemande;
	private Pizza[] pizzas;
	private états etat;
	
	public int getPrix() {
		int res =0;
		for (int p=0; p< pizzas.length; p++){
			res += pizzas[p].getPrix();
		}
		return res;
	}

	public états getEtat() {
		return etat;
	}

	public void setEtat(états etat) {
		this.etat = etat;
	}

	public Date getDatelivraisonDemande() {
		return datelivraisonDemande;
	}

	public void setDatelivraisonDemande(Date datelivraisonDemande) {
		this.datelivraisonDemande = datelivraisonDemande;
	}

	public Collaborateur getCollaborateur() {
		return collaborateur;
	}

	public void setCollaborateur(Collaborateur collaborateur) {
		this.collaborateur = collaborateur;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Pizza[] getPizzas() {
		return pizzas;
	}

	public void setPizzas(Pizza[] pizzas) {
		this.pizzas = pizzas;
	}
}
