package org.iesalandalus.programacion.peonajedrez;

public class Peon {
	/*
	 * 11. Crea la clase Peon, dentro del paquete adecuado, cuyos atributos serán un
	 * color (del tipo enumerado Color) y posicion (de la clase Posicion), con la
	 * visibilidad adecuada. Haz un commit.
	 */
	private Color color;
	private Posicion posicion;

	/*
	 * 12. Crea los métodos get y set para cada atributo con la visibilidad
	 * adecuada. Estos métodos siempre comprobarán la validez de los parámetros
	 * pasados y si no son correctos deberá lanzar la excepción adecuada
	 * (NullPointerException o IllegalArgumentException) con el mensaje adecuado.
	 * Haz un commit.
	 */

	public Color getColor() {
		return color;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	private void setColor(Color color) {
		if (color == null) {
			throw new NullPointerException("ERROR: No es posible asignar un color nulo");
		}
		this.color = color;
	}

	private void setPosition(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("ERROR: No es posible asignar una posicion nula");
		}
		this.posicion = posicion;
	}

	/*
	 * 13. Crea un constructor por defecto para esta clase que cree un peón negro en
	 * la posición '7d'. Haz un commit.
	 */

	public Peon() {
		this.color = Color.NEGRO;
		this.posicion = new Posicion(7, 'd');
	}

	/*
	 * 14. Crea un constructor para la clase que acepte como parámetro el color y
	 * que creará un peón de dicho color cuya posición será '2d' si es blanco o '7d'
	 * si es negro. Haz un commit.
	 */
	public Peon(Color color) {
		if (color == null) {
			throw new NullPointerException("ERROR: No es posible asignar un color nulo");
		}
		if (color == Color.BLANCO) {
			this.posicion = new Posicion(2, 'd');
		} else {
			if (color == Color.NEGRO) {
				this.posicion = new Posicion(7, 'd');
			}
		}
	}

}
