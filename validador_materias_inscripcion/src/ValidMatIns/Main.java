
package ValidMatIns;

/*
NOTA: Se va a leer por terminal datos para crear un alumno,
crear una materia con correlatividades y realizar una
inscripcion a una materia si es posible.

PRIMERO:
	Crear y tomar datos para una materia, así como sus correlatividades.

SGUNDO:
	Craear y tomar datos de una alumno, así como sus posibles materias ya aprobadas.

TERCERO:
	Imprimir si el alumno está o no apto para la inscripcion a la materia.
*/

import ValidMatIns.negocios.Bsnss;

public class Main {
	public static void main(String[] args) {
		Bsnss app = new Bsnss();
		app.ejecutar();
	}
}
