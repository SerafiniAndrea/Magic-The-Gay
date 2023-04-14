/**
 * 
 */
package carte;

import java.util.ArrayList;

/**
 * @author Labmultimediale
 *
 */
public class Creatura extends Carta{
	
	private int forza = 0;
	private int costituzione = 0;
	private ArrayList<Mana> mana = new ArrayList<>();
	
	public Creatura(String nome, int costo, int forza, int costituzione, ArrayList<Mana> mana) {
		super(Tipo.Creatura, nome, costo);
		this.setForza(forza);
		this.setCostituzione(costituzione);
		this.mana.addAll(mana);
	}
	
	/**
	 * @return the forza
	 */
	public int getForza() {
		return forza;
	}

	/**
	 * @param forza the forza to set
	 */
	public void setForza(int forza) {
		this.forza = forza;
	}

	/**
	 * @return the costituzione
	 */
	public int getCostituzione() {
		return costituzione;
	}

	/**
	 * @param costituzione the costituzione to set
	 */
	public void setCostituzione(int costituzione) {
		this.costituzione = costituzione;
	}
	
}
