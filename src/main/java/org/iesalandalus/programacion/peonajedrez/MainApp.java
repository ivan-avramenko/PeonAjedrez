package org.iesalandalus.programacion.peonajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	private static Peon peon;

	public static void main(String[] args) {
		System.out.println("Programa para aprender a colocar y mover un peón en el tablero de ajedrez");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Hasta luego Lucas!!!!");
	}

	/*
	 * 20. i. void mostrarPeon(): mostrará por consola la representación del peón
	 * representado por el atributo de clase peon (crea el atributo si aún no lo has
	 * hecho)
	 */
	private static void mostrarPeon() {

	}

	/*
	 * 20. ii. void mostrarMenu(): mostrará por consola el menú con las diferentes
	 * opciones de nuestro programa.
	 */

	private static void mostrarMenu() {
		System.out.println("Mostrar menu :");

	}

	/*
	 * 20 iii. int elegirOpción(): Nos mostrará un mensaje para que elijamos una
	 * opción del menú anteriormente creado y nos pedirá que introduzcamos por
	 * teclado la opción hasta que ésta sea valida. Devolverá la opción elegida.
	 */

	private static void elegirOpcion() {
		System.out.println("Eliga una opcion :");

	}

	/*
	 * 20. iv Color elegirColor() iv Nos preguntará que elijamos un color mientras
	 * éste no sea válido y dependiendo de la opción elegida devolverá un color u
	 * otro.
	 */
	private static Color elegirColor() {

	}

	/*
	 * 20. v char elegirColumnaInicial(): Nos preguntará que elijamos la columna
	 * inicial mientras ésta no sea válida y devolverá la columna elegida.
	 */
	private static char elegirColumnaInicial() {
		char columna;
		columna = Entrada.caracter();
		return columna;
	}

	/*
	 * 20. vi. void mostrarMenuMovimientos(): Mostrará por consola un menú con los
	 * diferentes movimientos que podemos realizar: avanzar peón un paso, avanzar
	 * peón dos pasos, avanzar peón hacia la izquierda y avanzar peón hacia la
	 * derecha.
	 */
	private static void mostrarMenuMovimientos() {
		System.out.println("1. - Avanzar peon un paso");
		System.out.println("2. - Avanzar peon dos pasos");
		System.out.println("3. - Avanzar peon hacia la izquierda");
		System.out.println("4. - Avanzar peon hacia la derecha");
	}

	/*
	 * 20. vii. int elegirMovimiento(): Nos mostrará un mensaje para que elijamos
	 * una opción del menú anteriormente creado y nos pedirá que introduzcamos por
	 * teclado la opción hasta que ésta sea valida. Devolverá la opción elegida.
	 */
	private static int elegirMovimiento() {
		int opcion;
		System.out.println("Elige una opcion del menu ");
		opcion = Entrada.entero();
		return opcion;
	}
	/*
	 * 20. viii. void realizarMovimiento(int): Dependiendo de la opción asociada al
	 * movimiento del menú de movimientos, realizará un movimiento u otro.
	 */

	private static void realizarMovimiento() {

	}

	/*
	 * 20. ix. void crearPeonDefecto(): Asignará al atributo de clase peon una nueva
	 * instancia de un peón creado con el constructor por defecto.
	 */
	private static void crearPeonDefecto() {
		peon = new Peon();
	}

	/*
	 * 20. x. void crearPeonColor(): Asignará al atributo de clase peon una nueva
	 * instancia de un peón creado con el constructor al que le pasamos el color.
	 * Este método debe utilizar métodos ya implementados anteriormente.
	 */
	private static void crearPeonColor() {

	}

	/*
	 * 20. xi. void crearPeonColorColumna(): Asignará al atributo de clase peon una
	 * nueva instancia de un peón creado con el constructor al que le pasamos el
	 * color y la columna inicial. Este método debe utilizar métodos ya
	 * implementados anteriormente.
	 */
	private static void crearPeonColorColumna() {

	}

	/*
	 * 20. xii. void mover(): Mostrará un menú con los posibles movimientos, nos
	 * preguntará cual queremos realizar y lo realizará. Este método debe utilizar
	 * métodos ya implementados anteriormente.
	 */
	private static void mover() {

	}

	/*
	 * 20. xiii. void ejecutarOpcion(int): Depediendo de la opción pasada como
	 * parámetro, actuará en consecuencia. Este método debe utilizar métodos ya
	 * implementados anteriormente.
	 */
	private static void ejecutarOpcion() {
		
	}
}
