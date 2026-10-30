package compagnons;

import objets.Equipement;

public class Thalmor {
	private String nom;
	private int force;
	private int nbEquipement = 0;

	public Thalmor(String nom, int force) {
		this.nom = nom;
		this.force = force;
		
		assert isInvariantVerified();
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");

	}

	private String prendreParole() {
		return "Le thalmor " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0;
		int ancienneForce = force;
		force = force - forceCoup;
		
		if (force < 1) {
			force = 0;
			parler("J'abandonne !");
		} else {
			parler("Aïe");
		}
		
		assert isInvariantVerified();
		assert force < ancienneForce;
		
	}
	
	private boolean isInvariantVerified() {
		return force >= 0;
	}
	
	public static void main(String[] args) {
		Thalmor malborn = new Thalmor("Malborn", 6);
		
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		
		malborn.sEquiper(Equipement.CASQUE);
		malborn.sEquiper(Equipement.CASQUE);
		malborn.sEquiper(Equipement.BOUCLIER);
		malborn.sEquiper(Equipement.CASQUE);
	}
	
	private Equipement[] equipements = new Equipement[2];
	
	private void ajouterEquipement(Equipement equipement) {
		equipements[nbEquipement] = equipement;
	    nbEquipement++;
	    System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		case 1:
		    if (equipements[0] == equipement) {
		        System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
		    } else {
		    	ajouterEquipement(equipement);
		    }
		    break;
		case 0:
			ajouterEquipement(equipement);
			break;
		}
		
	}
	
	
}
