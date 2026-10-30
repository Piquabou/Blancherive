package compagnons;

public class Thalmor {
	private String nom;
	private int force;

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
	}
	
}
