/**
 * 
 */
package magicTheGay;

import java.util.ArrayList;

import carte.Carta;

/**
 * @author Labmultimediale
 *
 */
public class Player {
	
	public ArrayList<Carta> mazzo = new ArrayList<>();
	public ArrayList<Carta> cimitero = new ArrayList<>();
	public ArrayList<Carta> terre = new ArrayList<>();
	public ArrayList<Carta> mano = new ArrayList<>();
	public int vita = 20;
	
	public Player() {
		
	}
	
	public void pesca() {
		this.mano.add(this.mazzo.get(0));
		this.mazzo.remove(0);
	}
	
	public void scarta() {
		this.cimitero.add(null);
		
	}
	
}
