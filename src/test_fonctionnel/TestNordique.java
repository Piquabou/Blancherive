package test_fonctionnel;

import compagnons.Nordique;
import compagnons.Thalmor;

public class TestNordique {
	public static void main(String[] args) {
		Nordique geralt = new Nordique("Geralt", 8);
		Nordique ulfberth = new Nordique("Ulfberth", 16);
		
		geralt.parler("Bonjour Ulfberth.");
		ulfberth.parler("Bonjour Geralt. Ca te dirait d'aller chasser des dragons ?");
		geralt.parler("Oui très bonne idée.");
		
		Thalmor ancano = new Thalmor("Ancano", 6);
		
		System.out.println("Dans la forêt " + geralt + " et " + ulfberth +
				" tombent nez à nez sur le thalmor " + ancano.getNom() + ".");
		
		for (int i = 0; i < 3; i++) {
			geralt.frapper(ancano);
		}
	}
}
