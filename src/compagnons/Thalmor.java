package compagnons;

public class Thalmor {
	private String nom;
	private int force;

	public Thalmor(String nom, int force) {
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
		return "Le thalmor " + nom + " : ";
	}
}
