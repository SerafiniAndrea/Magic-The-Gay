/**
 * 
 */
package carte;

import java.util.ArrayList;

/**
 * @author Labmultimediale
 *
 */
public class Istantaneo extends Carta{
	
	private ArrayList<Mana> mana = new ArrayList<>();
	
	public Istantaneo(String nome, int costo, ArrayList<Mana> mana) {
		super(Tipo.Istantaneo, nome, costo);
		this.mana.addAll(mana);
	}
	
}
