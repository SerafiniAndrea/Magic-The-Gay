/**
 * 
 */
package carte;

/**
 * @author Labmultimediale
 *
 */
public abstract class Carta {
	
	private Tipo tipo;
	private String nome;
	private int costo;
	
	public Carta(Tipo tipo, String nome, int costo) {
		this.tipo = tipo;
		this.nome = nome;
		this.setCosto(costo);
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
	 * @return the tipo
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
}
