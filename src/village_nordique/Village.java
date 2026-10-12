package village_nordique;

import compagnons.Nordique;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Nordique chef;
	private Nordique[] villageois;
	
	
	public String getNom() {
		return nom;		
	}
	
	public Nordique getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Nordique nordique) {
		villageois[nbVillageois] = nordique;
		nbVillageois++;
		nordique.setVillage(this);
	}
	
	public static void main(String[] args) {
		Nordique burguk =  new Nordique("Burguk", 6);
		Village village = new Village("Blancherive", burguk, 30);	
		
		village.trouverVillageois(30);
	}
	
	public Nordique trouverVillageois(int numVillageois) {
		if (numVillageois > 0 && numVillageois <= nbVillageois) {
			return villageois[numVillageois - 1];
		}
		
		System.out.println("Il n'y a pas autant d'habitants dans notre village !");
		return null;
	}
	
	public void afficherVillage() {
		
	}
	
	public Village(String nom, Nordique chef, int nbVillageoisMax) {
		this.nom = nom;
		this.chef = chef;
		this.villageois = new Nordique[nbVillageoisMax];
	}
	
	
		
	

}
