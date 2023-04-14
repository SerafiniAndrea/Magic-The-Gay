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
public class Creatura extends Carta{
	
	private boolean utilizzata = false;
	private int forza = 0;
	private int costituzione = 0;
	private ArrayList<Mana> mana = new ArrayList<>();
	
	public Creatura(String nome, int costo, int forza, int costituzione, ArrayList<Mana> mana) {
		super(Tipo.Creatura, nome, costo);
		this.setForza(forza);
		this.setCostituzione(costituzione);
		this.mana.addAll(mana);
	}
	
	public void gira() {
		Scanner sc = new Scanner(System.in);
		if(isUtilizzata()) {
			setUtilizzata(false);
		} else {
			setUtilizzata(true);
		}
		sc.close();
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
	
}
