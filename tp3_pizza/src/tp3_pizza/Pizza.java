package tp3_pizza;


public class Pizza {
	
	public enum taillePizza { PetitePizza, GrandePizza}
	
	taillePizza taille;
	private int prix;
	private String nom;
	private String photos;
	
	public Pizza(int prix, String nom, String photos, taillePizza taille) {
		this.taille = taille;
		this.prix = prix;
		this.nom = nom;
		this.photos = photos;
	}
	
	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getPhotos() {
		return photos;
	}

	public void setPhotos(String photos) {
		this.photos = photos;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
