/**
 * 
 */
package magicTheGay;

import java.util.Collections;

import carte.*;


public class Main {


	
	public static boolean randomBool(double random) {
		if(random >= 0.5) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
	
		
		double numeroditurni = 0;
		
		boolean firstplayer = randomBool(Math.random());
		
		Libreria libreria = new Libreria();
		
		Player you = new Player();
		Player opponent = new Player();
		
		you.mazzo.addAll(libreria.drawTwoDimir);
		opponent.mazzo.addAll(libreria.drawTwoDimir);
		
		Collections.shuffle(you.mazzo);
		Collections.shuffle(opponent.mazzo);
		
		
		for(int j = 0; j < 1; j++) {
			
			if(numeroditurni == 0) {
				
				for(int i = 0; i < 7; i++) {
					
					you.pesca();
					opponent.pesca();
				
				}
			}
			
			if(firstplayer) {
				
				opponent.pesca();
				
			} 
			else {
				
				you.pesca();
				
			}
			numeroditurni++;
		}
	}
}
