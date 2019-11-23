package org.iesalandalus.programacion.peonajedrez;

import javax.naming.OperationNotSupportedException;

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

	/*
	 * 15. Crea un constructor para la clase que acepte como parámetros el color y
	 * la columna inicial. La columna inicial debe ser válida (de lo contrario debe
	 * lanzar la excepción IllegalArgumentException con un mensaje adecuado) y
	 * creara un peón del color dado y colocado en dicha columna y cuya fila será la
	 * 2 si es blanco y la 7 si es negro. Haz un commit.
	 */
	public Peon(Color color, char columna) {
		if (color == null) {
			throw new NullPointerException("ERROR: No es posible asignar un color nulo");
		}
		if (color == Color.BLANCO) {
			this.posicion = new Posicion(2, columna);
		} else {
			this.posicion = new Posicion(7, columna);
		}
	}

	/*
	 * 16. Crea el método mover que acepte como parámetro una Direccion y
	 * dependiendo de dicha dirección modificará la posición del mismo. Si no puede
	 * realizar dicho movimiento debe lanzar una excepción del tipo
	 * OperationNotSupportedException con un mensaje adecuado y no modificará la
	 * posición del peón. Haz un commit.
	 */
	public void mover(Direccion direccion) throws OperationNotSupportedException {
		if (direccion == null) {
			throw new IllegalArgumentException("La dirección no puede ser nula.");
		}
	}
	/*
	 * 17. Sobrecarga el método mover que acepte como parámetro un entero y que
	 * dependiendo del entero modificará la posición del mismo el número de pasos
	 * indicado por dicho entero. Si no puede realizar dicho movimiento debe lanzar
	 * una excepción del tipo OperationNotSupportedException con un mensaje adecuado
	 * y no modificará la posición del peón. Haz un commit.
	 */

	
	/*
	 * 18. Crea los métodos equals y hashCode para esta clase. Haz un commit.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
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
		Peon other = (Peon) obj;
		if (color != other.color)
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}

}
