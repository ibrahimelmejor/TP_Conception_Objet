package tp3_pizza;

import java.util.HashMap;
import tp3_pizza.Collaborateur.�tatCollab;

public class System {
	
	public enum �tats { Command�, EnCoursDePr�paration, PretePourLivraison, EnCoursDeLivraison, Livr�}
	//On a besoin de conna�tre l'�tat des diff�rentes commandes � chaque instant
	private HashMap<Commande, �tats> �tatCommandes;
	// collabPointP permet de savoir � quel Point Pizza chaque collaborateur est li� � un instant t
	private HashMap<Collaborateur, PointPizza> collabPointP;
	
	public System() {
		collabPointP = new HashMap<Collaborateur, PointPizza>();
		�tatCommandes = new HashMap<Commande, �tats>();
	}
	
	public void affect(Collaborateur c, PointPizza p) {
		c.�tatCollaborateur=�tatCollab.occup�;
		collabPointP.put(c, p);
	}
	
	public void free(Collaborateur c) {
		c.�tatCollaborateur=�tatCollab.libre;
		collabPointP.remove(c);
	}
	
	public void getCollaborateurDispo(){
		
	}
}
