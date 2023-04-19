/**
 * 
 */
package magicTheGay;

import java.util.Scanner;
import java.util.ArrayList;

import carte.Carta;

/**
 * @author Labmultimediale
 *
 */
public class Player implements Cloneable {
	
	public ArrayList<Carta> mazzo = new ArrayList<>();
	public ArrayList<Carta> cimitero = new ArrayList<>();
	public ArrayList<Carta> terre = new ArrayList<>();
	public ArrayList<Carta> mano = new ArrayList<>();
	public ArrayList<Carta> campo = new ArrayList<>();
	
	public int vita = 20;
	
	public Player() {
		
	}
	
	public void pesca() {
		this.mano.add(this.mazzo.get(0));
		this.mazzo.remove(0);
	}
	
	public void scarta() {
		
		Scanner scanner = new Scanner (System.in);
		
		int cartaDaScartare = 0;
		int i = 0;
		System.out.println("Scegli una carta da scartare: ");
		for(Carta carta : mano) {
			System.out.println(i + 1 + " " + carta.getNome());
			i++;
		}
		scanner.nextInt();
		this.cimitero.add(this.mano.get(cartaDaScartare-1));
		
	}
	
	@Override
	public Player clone() throws CloneNotSupportedException{
		return (Player)super.clone();
	}
	
}
