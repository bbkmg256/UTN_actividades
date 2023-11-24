
package conversor_strings.clases;

// NOTA: Genera una lista (mejor dicho un arraylist) con strings en mayuscula.


import java.util.ArrayList;

public class ConverString {
	// Atribs.
	// Natrix
	
	//Construc.
	public ConverString() {
		// Natrix
	}
	
	// Setters
	// Natrix
	
	// Getters
	// Natrix
	
	// Metods.
	public static ArrayList<String> aMayuscula(ArrayList<String> lista) {
		ArrayList<String> tempList = new ArrayList<>();
		
		// El pinshe metodo foreach tiene en sus parametros una funcion lambda...
		lista.stream().forEach((elementoString) -> tempList.add(elementoString.toUpperCase()));
		
		return tempList;
	}
}
