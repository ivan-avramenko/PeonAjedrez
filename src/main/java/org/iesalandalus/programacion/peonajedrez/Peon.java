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

}
