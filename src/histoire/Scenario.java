package histoire;

import compagnons.Nordique;
import compagnons.Thalmor;
import compagnons.Alchimiste;
import objets.Equipement;

//import village_gaulois.Musee;

public class Scenario {

	public static void main(String[] args) {
		Alchimiste alchimiste = new Alchimiste("Arcadia", 5);
		alchimiste.parler("Je vais aller préparer une petite potion...");
		alchimiste.fabriquerPotion(5, 3);
		Nordique ulfberth = new Nordique("Ulfberth", 25);
		Nordique geralt = new Nordique("Geralt", 8);
		alchimiste.booster(ulfberth);
		ulfberth.parler("Par Akatosh, ce n'est pas juste !");
		alchimiste.booster(geralt);
		geralt.parler("Bonjour");
		Thalmor malborn = new Thalmor("Malborn", 6);
		Thalmor ancano = new Thalmor("Ancano", 8);
		malborn.sEquiper(Equipement.BOUCLIER);
		malborn.sEquiper(Equipement.CASQUE);
		ancano.sEquiper(Equipement.CASQUE);
		malborn.parler("UN NOR... UN NORNOR...");
		int forceAvantCoup;
		do {
			forceAvantCoup = malborn.getForce();
			geralt.frapper(malborn);
		} while (malborn.getForce() > 0 && malborn.getForce() != forceAvantCoup);
		
//		PARTIE 5 : a decommenter
//		ancano.parler("UN NOR... UN NORNOR...");
//		do {
//			ulfberth.frapper(ancano);
//		} while (ancano.getForce() > 0);


//		Musee musee = new Musee();
//		ulfberth.faireUneDonnation(musee);

	}

}
