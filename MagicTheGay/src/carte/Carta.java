/**
 * 
 */
package carte;

import java.util.ArrayList;

/**
 * @author Labmultimediale
 *
 */
public class Carta {
	
	private Tipo tipo;
	private String nome = "";
	private int costo = 0;
	private int forza = 0;
	private int costituzione = 0;
	
	public Carta(Tipo tipo, String nome, int costo, int forza, int costituzione) {
		this.setTipo(tipo);
		this.setNome(nome);
		this.setCosto(costo);
		this.setForza(forza);
		this.setCostituzione(costituzione);
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the costo
	 */
	public int getCosto() {
		return costo;
	}

	/**
	 * @param costo the costo to set
	 */
	public void setCosto(int costo) {
		this.costo = costo;
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
	 * @return the tipo
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
}
