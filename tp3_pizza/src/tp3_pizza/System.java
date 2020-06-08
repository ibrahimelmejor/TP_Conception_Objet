package tp3_pizza;

import java.util.HashMap;
import tp3_pizza.Collaborateur.étatCollab;

public class System {
	
	public enum états { Commandé, EnCoursDePréparation, PretePourLivraison, EnCoursDeLivraison, Livré}
	//On a besoin de connaître l'état des différentes commandes à chaque instant
	private HashMap<Commande, états> étatCommandes;
	// collabPointP permet de savoir à quel Point Pizza chaque collaborateur est lié à un instant t
	private HashMap<Collaborateur, PointPizza> collabPointP;
	
	public System() {
		collabPointP = new HashMap<Collaborateur, PointPizza>();
		étatCommandes = new HashMap<Commande, états>();
	}
	
	public void affect(Collaborateur c, PointPizza p) {
		c.étatCollaborateur=étatCollab.occupé;
		collabPointP.put(c, p);
	}
	
	public void free(Collaborateur c) {
		c.étatCollaborateur=étatCollab.libre;
		collabPointP.remove(c);
	}
	
	public void getCollaborateurDispo(){
		
	}
}
