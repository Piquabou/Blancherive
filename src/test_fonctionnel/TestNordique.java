package test_fonctionnel;

import compagnons.Nordique;

public class TestNordique {
	public static void main(String[] args) {
		Nordique geralt = new Nordique("Geralt", 8);
		Nordique ulfberth = new Nordique("Ulfberth", 16);
		
		geralt.parler("Bonjour Ulfberth.");
		ulfberth.parler("Bonjour Geralt. Ca te dirait d'aller chasser des dragons ?");
		geralt.parler("Oui très bonne idée.");
	}
	
}
