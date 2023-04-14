/**
 * 
 */
package carte;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Labmultimediale
 *
 */
public class Terra extends Carta{
	
	private boolean utilizzata = false;
	private ArrayList<Mana> mana;
	private Mana manaBase = null;
	private Mana manaSecondario = null;
	boolean effetto = false;
	
	public Terra(String nome, Mana mana) {
		super(Tipo.Terra, nome, 0);
		this.setManaBase(mana);
	}
	public Terra(String nome, Mana mana1, Mana mana2) {
		super(Tipo.Terra, nome, 0);
		this.mana.add(mana1);
		this.mana.add(mana2);
	}
	public Terra(String nome, Mana mana1, Mana mana2, Mana mana3, boolean base) {
		super(Tipo.Terra, nome, 0);
		if(base) {
			this.setManaBase(mana1);
			this.mana.add(mana2);
			this.mana.add(mana3);
		} else {
			this.mana.add(mana1);
			this.mana.add(mana2);
			this.mana.add(mana3);
		}
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
		Scanner sc = new Scanner(System.in);
		if(isUtilizzata()) {
			setUtilizzata(false);
			setManaSecondario(null);
		} else {
			setUtilizzata(true);
			System.out.println("Scegli il mana tra");
			for(int i = 0; i < mana.size(); i++) {
				System.out.println(" " + mana.get(i));
			}
			setManaSecondario(mana.get(sc.nextInt()));
		}
		sc.close();
	}
	/**
	 * @return the manaBase
	 */
	public Mana getManaBase() {
		return manaBase;
	}
	/**
	 * @param manaBase the manaBase to set
	 */
	public void setManaBase(Mana manaBase) {
		this.manaBase = manaBase;
	}
	/**
	 * @return the manaSecondario
	 */
	public Mana getManaSecondario() {
		return manaSecondario;
	}
	/**
	 * @param manaSecondario the manaSecondario to set
	 */
	public void setManaSecondario(Mana manaSecondario) {
		this.manaSecondario = manaSecondario;
	}
}
