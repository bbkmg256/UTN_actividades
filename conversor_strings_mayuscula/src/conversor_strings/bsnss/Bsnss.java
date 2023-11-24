
package conversor_strings.bsnss;

// NOTA: Negocios unicamente...

import static conversor_strings.clases.ConverString.aMayuscula;
import static conversor_strings.clases.ConcatString.concatenar;
import java.util.Scanner;
import java.util.ArrayList;

public class Bsnss {
	// Atribs.
	private ArrayList<String> listaStr = new ArrayList<>();
	int VALOR_NUMERICO = 5;
	
	// Construc.
	public Bsnss() {
		// Natrix
	}
	
	// Setters
	// Natrix
	
	// Getters
	// Natrix
	
	// Metods.
	// Alto dolor de buebos hacer esto xd...
	private void cargarDato(ArrayList<String> lal) {
		String dato = "";
		Scanner lectDat = new Scanner(System.in);
		
		boolean valorGeneral = true, valor;
		while (valorGeneral) {
			// Ingreso datos...
			do {
				System.out.print("> Ingrese una palabra a la lista: "); dato = lectDat.nextLine();
			} while ("".equals(dato));
			lal.add(dato);
			
			// Verificacion para volver a cargar o abandonar...
			dato = ""; valor = true;
			do {
				System.out.print("> Desea ingresar mas datos?(S/N): "); dato = lectDat.nextLine();
				if (!"".equals(dato)) {
					switch(dato.toUpperCase().charAt(0)) {
						case 'N':
							valor = !valor; valorGeneral = valor;
							break;
						case 'S':
							valor = !valor;
							break;
					}
				}
			} while (valor);
		}
	}
	
	public void ejecutar() {
		// Carga e imprime...
		cargarDato(listaStr);
		System.out.println("\n> Lista en mayuscula: " + aMayuscula(listaStr));
		System.out.println("> String con palabras mayores a " + this.VALOR_NUMERICO + " chars: \"" + concatenar(this.listaStr, this.VALOR_NUMERICO) + "\"");	
	}
}
