package objets;

import com.sun.org.apache.xpath.internal.axes.SelfIteratorNoPredicate;

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
	}
}


