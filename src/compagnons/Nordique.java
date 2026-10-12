package compagnons;

import village_nordique.Village;

public class Nordique {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;

	public Nordique(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");

	}

	private String prendreParole() {
		return "Le nordique " + nom + " : ";
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}
	
	public void setVillage(Village village) {
		this.village = village;
	}
	
	public void sePresenter() {
		
	}

	@Override
	public String toString() {
		return nom;
	}
	
	public void frapper(Thalmor thalmor) {
		String nomThalmor = thalmor.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomThalmor);
		int forceCoup = (force * effetPotion) / 3;
		thalmor.recevoirCoup(forceCoup);
		
		if (effetPotion > 1) {
			effetPotion--;
		}
	}

	public static void main(String[] args) {
		Nordique geralt = new Nordique ("Geralt", 8);
		System.out.println(geralt);
		
	}
	
	
}
