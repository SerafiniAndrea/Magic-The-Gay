/**
 * 
 */
package magicTheGay;

import java.util.Collections;

import java.util.Scanner;

import carte.*;


public class Main {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		
		double numeroditurni = 0;
		
		String giocaterre = "";
		int giocaqualeterra = 0;
		
		boolean firstplayer = randomBool(Math.random());
		
		Libreria libreria = new Libreria();
		
		Player you = new Player();
		Player opponent = new Player();
		Player player = new Player();
		
		you.mazzo.addAll(libreria.drawTwoDimir);
		opponent.mazzo.addAll(libreria.drawTwoDimir);
		
		Collections.shuffle(you.mazzo);
		Collections.shuffle(opponent.mazzo);
		
		if(numeroditurni == 0) {
			
			for(int i = 0; i < 7; i++) {
				you.pesca();
				opponent.pesca();
			}
		}
			
		do {
			
			if(firstplayer) {
				try {
					player = opponent.clone();
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
				firstplayer = false;
			} else {
				try {
					player = you.clone();
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
				firstplayer = true;
			}
			
			if (numeroditurni !=0) {
				opponent.pesca();
			}
				
			int escludi = 0;
				
			do {
					
				System.out.println("Vuoi giocare le terre? Si o No: ");
				giocaterre = scanner.nextLine();
					
				
				if(giocaterre.equals("Si") || giocaterre.equals("SI") || giocaterre.equals("sI") || giocaterre.equals("si")) {
					
					for(int i = 0; i < opponent.mano.size(); i++) {
					
						if(opponent.mano.get(i).getTipo() == Tipo.Terra) {
						
							System.out.println(i + 1 + " " + opponent.mano.get(i).getNome());
							
						}
					}
					
					System.out.println("Quale terre vuoi giocare? ");
					giocaqualeterra = scanner.nextInt();
						
					if(opponent.terre.isEmpty() == true) {
							
						System.out.println("Quali terre vuoi attivare? ");
							
							
					}
				
				}
				
				else if (giocaterre.equals("No") || giocaterre.equals("NO") || giocaterre.equals("nO") || giocaterre.equals("no")) {
					
					continue;
					
				}
				
				else {
					
					System.out.println("Scelta invalida. ");
					escludi = 1;
				}
					
			} while(escludi != 0);
			
			numeroditurni++;
			
		}while(you.vita <= 0 || opponent.vita <= 0);
		
	}
	
	public static boolean randomBool(double random) {
		
		if (random >= 0.5) {
			
			return true;
		
		} 
		
		else {
		
			return false;
		
		}	
	}
}
