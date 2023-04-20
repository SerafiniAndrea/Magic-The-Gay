/**
 * 
 */
package magicTheGay;

import java.util.Scanner;
import java.util.ArrayList;

import carte.*;

/**
 * @author Labmultimediale
 *
 */
public class Player implements Cloneable {
	
	//Array del mazzo di carte del giocatore
	public ArrayList<Carta> mazzo = new ArrayList<>();
	//Array del cimitero delle carte scartate dal giocatore
	public ArrayList<Carta> cimitero = new ArrayList<>();
	//Array delle terre posizionate in campo dalla mano nella sezione apposita
	public ArrayList<Terra> terreInCampo = new ArrayList<>();
	//Array di tutte le carte che il giocatore ha in mano
	public ArrayList<Carta> mano = new ArrayList<>();
	//Array di tutte le carte(non terre) giocate e posizionate in campo
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
	
	public boolean checkTerre() {
		for(int i = 0; i < mano.size(); i++) {
			if(this.mano.get(i).getTipo() == Tipo.Terra) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public Player clone() throws CloneNotSupportedException{
		return (Player)super.clone();
	}
	
}
