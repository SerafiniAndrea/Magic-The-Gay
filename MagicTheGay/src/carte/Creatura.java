/**
 * 
 */
package carte;

/**
 * @author Labmultimediale
 *
 */
public class Creatura extends Carta{
	
	private int forza = 0;
	private int costituzione = 0;
	
	public Creatura(String nome, int costo, int forza, int costituzione) {
		super(Tipo.Creatura, nome, costo);
		this.setForza(forza);
		this.setCostituzione(costituzione);
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
