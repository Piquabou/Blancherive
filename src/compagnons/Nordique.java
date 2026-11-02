package compagnons;

import village_nordique.Village;
import objets.Equipement;

public class Nordique {
	private String nom;
	private int force;
	private int nbtrophees;
	private Equipement[] trophees = new Equipement[100];
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

////	private String prendreParole() {
////		return "Le nordique " + nom + " : ";
//	}

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
		if (village == null) {
			parler("Bonjour, je m'appelle " + nom + ". Je voyage de villages en villages.");
		} else if (village.getChef() == this) {
			parler("Bonjour, je m'appelle " + nom + ". Je suis le chef du village : " + village.getNom() + ".");
		} else {
			parler("Bonjour, je m'appelle " + nom + ". J'habite le village : " + village.getNom() + "."); 
		}
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
//	public void frapper(Thalmor thalmor) {
//		String nomThalmor = thalmor.getNom();
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomThalmor);
//		int forceCoup = (force * effetPotion) / 3;
//		thalmor.recevoirCoup(forceCoup);
//		
//		if (effetPotion > 1) {
//			effetPotion--;
//		}
//	}

//	public static void main(String[] args) {
//		Nordique geralt = new Nordique ("Geralt", 8);
//		System.out.println(geralt);
//		
//	}
	
	public void frapper(Thalmor thalmor) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + thalmor.getNom());
		Equipement[] tropheesBataille = thalmor.recevoirCoup((force / 3) * effetPotion);
		effetPotion--;
		if (effetPotion < 1) {
			effetPotion = 1;
		}
		for (int i = 0; tropheesBataille != null && i < tropheesBataille.length; i++, nbtrophees++) {
			this.trophees[nbtrophees] = tropheesBataille[i];
		}
		
	}

	
	
}
