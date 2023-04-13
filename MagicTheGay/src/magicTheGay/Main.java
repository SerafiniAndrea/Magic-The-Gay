/**
 * 
 */
package magicTheGay;

import java.util.Collections;

import carte.*;

/**
 * @author Labmultimediale
 *
 */
public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libreria libreria = new Libreria();
		Player you = new Player();
		Player opponent = new Player();
		you.mazzo.addAll(libreria.grixisMidrange);
		opponent.mazzo.addAll(libreria.grixisMidrange);
		Collections.shuffle(you.mazzo);
		Collections.shuffle(opponent.mazzo);
		for(int i = 0; i < 7; i++) {
			you.pesca();
			opponent.pesca();
		}
		
	}

}
