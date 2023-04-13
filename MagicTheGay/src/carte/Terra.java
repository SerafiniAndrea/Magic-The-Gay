/**
 * 
 */
package carte;

import java.util.ArrayList;

/**
 * @author Labmultimediale
 *
 */
public class Terra extends Carta{
	
	private boolean utilizzata = false;
	private ArrayList<Mana> mana;
	boolean effetto = false;
	
	/*public Terra(String nome, Mana base, Mana opzione, boolean effetto) {
		super(Tipo.Terra, nome, 0);
		this.mana.add(base);
		this.effetto = effetto;
	}*/
	
	public Terra(String nome, Mana mana) {
		super(Tipo.Terra, nome, 0);
		this.mana.add(mana);
	}
	public Terra(String nome, Mana mana1, Mana mana2) {
		super(Tipo.Terra, nome, 0);
		this.mana.add(mana1);
		this.mana.add(mana2);
	}
	public Terra(String nome, Mana mana1, Mana mana2, Mana mana3, boolean base) {
		super(Tipo.Terra, nome, 0);
		this.mana.add(mana1);
		this.mana.add(mana2);
		this.mana.add(mana3);
	}
	/**
	 * @return the utilizzata
	 */
	public boolean isUtilizzata() {
		return utilizzata;
	}
	/**
	 * @param utilizzata the utilizzata to set
	 */
	public void setUtilizzata(boolean utilizzata) {
		this.utilizzata = utilizzata;
	}
	
	public void gira() {
		
		
	}
}
