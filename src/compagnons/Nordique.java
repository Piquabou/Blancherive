package compagnons;

public class Nordique {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Nordique(String nom, int force, int effetPotion) {
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
		
	}

	@Override
	public String toString() {
		return nom;
	}
	
	public void frapper(Thalmor thalmor) {
		String nomThalmor = thalmor.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomThalmor);
		int forceCoup = force / 3;
		thalmor.recevoirCoup(forceCoup);
	}

	public static void main(String[] args) {
		Nordique geralt = new Nordique ("Geralt", 8);
		System.out.println(geralt);
		
	}
	
	
}
