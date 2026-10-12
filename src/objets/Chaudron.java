package objets;


public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public Chaudron(int quantitePotion, int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	
	public int getForcePotion() {
		return forcePotion;
	}
	
	public int getQuantitePotion() {
		return quantitePotion;
	}
	
	public void remplirChaudron(int quantitePotion, int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	
	public boolean resterPotion() {
		return quantitePotion !=0;
	}
	
	public int prendreLouche() {
		int forceLouche = forcePotion;
		quantitePotion--;
		
		if (quantitePotion == 0) {
			forcePotion = 0;
		}
		
		return forceLouche;
	}
}


