
package string_convertidor.negocios;

// NOTA: En este codigo propuse una lista de 5 como un numero al azar ya que el ejercicio no especifica...

import java.util.ArrayList;
import java.util.Scanner;
import string_convertidor.interfaces.InterfString;

public class Bsnss implements InterfString {
	@Override
	public ArrayList<String> converString(ArrayList<String> x) {
		ArrayList<String> tempList = new ArrayList<String>();
		
		for (int i = 0; i < x.size(); i++) {
			tempList.add(x.get(i).toUpperCase());
		}
		
		return tempList;
	}
	
	public void ejecutar() {
		ArrayList<String> cad = new ArrayList<String>();
		Scanner lectorDatos = new Scanner(System.in);
		
		int i = 0; String dato = "";
		while (i < 5) {
			System.out.print("> Ingresa la cadena para el nodo n° " + (i+1) + ": "); dato = lectorDatos.nextLine();
			if (!dato.equals("")) {
				cad.add(dato);
				i++;
			} else {
				System.out.println("\n! ERROR: Debe ingresar un dato...");
			}
		}
		
		System.out.println("\n> La lista final es: " + this.converString(cad));
	}
}
