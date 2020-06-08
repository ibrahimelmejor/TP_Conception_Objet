package tp3_pizza;

public class Collaborateur {
	
	public enum moyenDeTransport { velo, voiture, marcheapied}
	public enum étatCollab { libre, occupé}
	
	private Long x;
	private Long y;
	private Long z;
	private Commande commandeEnCours;
	private PointPizza PP;
	private moyenDeTransport moyen;
	public étatCollab étatCollaborateur;
	
	public Collaborateur(Long x, Long y, Long z, Commande commande, PointPizza pp, moyenDeTransport moy) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.commandeEnCours = commande;
		this.PP = pp;
		this.moyen=moy;
		this.étatCollaborateur=étatCollab.libre;
	}
	
	public void trouverlePPleplusProche() {
		
	}
	
}
