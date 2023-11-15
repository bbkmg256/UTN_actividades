
package ValidMatIns.negocios;

// Manejo de negocios del sistema unicamente...

import ValidMatIns.clases.*;
import java.util.Scanner;


public class Bsnss {
	// Atribs.
	Scanner entrada = new Scanner(System.in);
	Materia mat = new Materia();
	Alumno alumn = new Alumno();
	Inscripcion inscripcion = new Inscripcion(alumn, mat);
	
	// Const.
	public Bsnss() {
		//natrix
	}
	
	// Metods.
	private boolean validador() {
		String datoEntrada = "";
		
		// bloquea el flujo del programa para verificar que algun dato es ingresado...
		while (datoEntrada.isEmpty()) {
			System.out.print("+ Desea ingresar un datos mas? (S/N): ");
			datoEntrada = this.entrada.nextLine();
		}
		
		return Character.toLowerCase(datoEntrada.charAt(0)) == 's';
	}
	
	public void ejecutar() {
		// Ingreso de datos materia...
		System.out.print("+ Ingrese el nombre de la materia: "); this.mat.setNombreMateria(this.entrada.nextLine());
		 
		boolean val = true;
		while (val) {
			System.out.print("+ Ingrese una regularidad para la materia " + this.mat.getNombreMateria() +": ");
			this.mat.setMateriaCorrelativa(new Materia(this.entrada.nextLine()));
			val = this.validador();
		}
		
		// Ingreso datos alumno...
		System.out.println("+ Ingrese los respectivos datos del alumno... ");
		System.out.print("- Nombre: "); this.alumn.setNombre(this.entrada.nextLine());
		
		System.out.print("- Apellido: "); this.alumn.setApellido(this.entrada.nextLine());
		
		// Verificar que lo ingresado sean numeros...
		System.out.print("- DNI: "); this.alumn.setDNI(this.entrada.nextLine());
		
		// System.out.print("- Fecha de nacimiento: ");
		
		System.out.println("- Materia(s) aprobada(s)... ");
		val = true; int k = 1;
		while (val) {
			System.out.print("Materia " + (k) + ": ");
			this.alumn.setMateriaAprobada(new Materia(this.entrada.nextLine()));
			val = this.validador();
			k++;
		}
		
		// Resultados finales...
		System.out.println("! El alumno " + this.alumn.getNombre() + " " + this.inscripcion.nosi(this.inscripcion.aprobada()) + " cumple con las regularidades para inscribirse a la materia " + this.mat.getNombreMateria() + "!");
	}
}
