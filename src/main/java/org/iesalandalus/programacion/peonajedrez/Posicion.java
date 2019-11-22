package org.iesalandalus.programacion.peonajedrez;

public class Posicion {
	/*
	 * 5. Crea la clase Posicion. Crea los atributos fila (int) y columna (char) con
	 * la visibilidad adecuada. Haz un commit.
	 */
	private int fila;
	private char columna;

	/*
	 * 6. Crea los métodos get y set para los atributos. Recuerda que para el método
	 * set se debe tener en cuenta que los valores son correctos (las filas van del
	 * 1 al 8 -ambos inclusive- y las columnas de la 'a' a la 'h' -ambas inclusive-)
	 * y si no se lance una excepción del tipo IllegalArgumentException con el
	 * mensaje adecuado y no modifique los atributos. Haz un commit.
	 */
	public int getFila() {
		return fila;
	}

	public char getColumna() {
		return columna;
	}

	private void setFila(int fila) {
		if (fila >= 1 || fila <= 8) {
			throw new IllegalArgumentException("ERROR: valor de fila no valido.");
		}
		this.fila = fila;
	}

	private void setColumna(char columna) {
		if (columna >= 'a' || columna <= 'h') {
			throw new IllegalArgumentException("ERROR: valor de columna no valido.");
		}
		this.columna = columna;
	}

	/*
	 * 7. Crea un constructor para esta clase que acepte como parámetros la fila y
	 * la columna y que los asigne a los atributos si son correctos y si no lance
	 * una excepción del mismo tipo que la anterior indicando el problema. Para ello
	 * utiliza los métodos set anteriormente creados. Haz un commit.
	 */
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}

	/*
	 * 8. Crea el constructor copia para esta clase. Haz un commit.
	 */

	public Posicion(Posicion copia) {
		if (copia == null)
			throw new NullPointerException("ERROR: No se puede copiar una Posicion nula.");
		this.fila = copia.fila;
		this.columna = copia.columna;

	}

	/*
	 * 9. Crea los métodos equals y hashCode para esta clase. Haz un commit.
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + columna;
		result = prime * result + fila;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		if (columna != other.columna)
			return false;
		if (fila != other.fila)
			return false;
		return true;
	}
	/*
	 * 10. Crea el método toString que devolverá un String y será la representación de la fila y la columna. Haz un commit.
	 * */

	@Override
	public String toString() {
		return "Posicion [fila=" + fila + ", columna=" + columna + "]";
	}
	
	
}
