package compagnons;
import objets.Chaudron;

public class Alchimiste {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	public Alchimiste(String nom, int force) {
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
		return "L'alchimiste " + nom + " : ";
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		
		parler("Voilà qui est fait. " + quantite + " doses, chacune d'une puissance de " + forcePotion + ". Faites en bon usage.");
	}
	
	public void booster(Nordique Nordique) {
		boolean contientPotion = chaudron.resterPotion();
		String nomNordique = nordique.getNom;
		if (contientPotion) {
			if (nomNordique.equals("Ulfberth")) {
				
		} else {
		}
			
		}
		                 
	}
		
}


