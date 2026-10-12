package compagnons;
import objets.Chaudron;

public class Alchimiste {
	private String nom;
	private Chaudron chaudron;
	private int force;
	
	public Alchimiste(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.chaudron = new Chaudron(0, 0);
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
	
	public void booster(Nordique nordique) {
		boolean contientPotion = chaudron.resterPotion();
		String nomNordique = nordique.getNom();
		if (contientPotion) {
			if (nomNordique.equals("Ulfberth")) {
				parler("Non, " + nomNordique + " ! Non !... Et tu le sais très bien !");
			} else {
				int forcePotion = chaudron.prendreLouche();
				nordique.boirePotion(forcePotion);
				parler("Tiens " + nomNordique + " un peu de potion magique.");
			}
			
		} else {
			parler("Désolé " + nomNordique + " il n'ya plus une seule goutte de potion.");
		}
		                 
	}
		
}


