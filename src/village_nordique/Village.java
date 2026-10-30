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
		Nordique ulfberth = new Nordique("Ulfberth", 25);
		Nordique jorgen = new Nordique("Jorgen", 4);
		Village village = new Village("Blancherive", burguk, 30);	
		
		village.trouverVillageois(30);
		
		Nordique geralt = new Nordique("Geralt", 8);
		village.ajouterVillageois(geralt);
		
		Nordique nordique = village.trouverVillageois(1);
		System.out.println(nordique);
		nordique = village.trouverVillageois(2);
		System.out.println(nordique);
		
		village.ajouterVillageois(ulfberth);
		village.afficherVillage();
		burguk.sePresenter();
		geralt.sePresenter();
		jorgen.sePresenter();
		
	}
	
	public Nordique trouverVillageois(int numVillageois) {
		if (numVillageois > 0 && numVillageois <= nbVillageois) {
			return villageois[numVillageois - 1];
		}
		
		System.out.println("Il n'y a pas autant d'habitants dans notre village !");
		return null;
	}
	
	public void afficherVillage() {
		System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom() + " vivent les légendaires nordiques : ");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.print("- " + villageois[i] + "\n");
		}
		
	}
	
	public Village(String nom, Nordique chef, int nbVillageoisMax) {
		this.nom = nom;
		this.chef = chef;
		this.villageois = new Nordique[nbVillageoisMax];
		chef.setVillage(this);
	}
	
	
		
	

}
