package tp3_pizza;

public class Collaborateur {
	
	public enum moyenDeTransport { velo, voiture, marcheapied}
	public enum �tatCollab { libre, occup�}
	
	private Long x;
	private Long y;
	private Long z;
	private Commande commandeEnCours;
	private PointPizza PP;
	private moyenDeTransport moyen;
	public �tatCollab �tatCollaborateur;
	
	public Collaborateur(Long x, Long y, Long z, Commande commande, PointPizza pp, moyenDeTransport moy) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.commandeEnCours = commande;
		this.PP = pp;
		this.moyen=moy;
		this.�tatCollaborateur=�tatCollab.libre;
	}
	
	public void trouverlePPleplusProche() {
		
	}
	
}
