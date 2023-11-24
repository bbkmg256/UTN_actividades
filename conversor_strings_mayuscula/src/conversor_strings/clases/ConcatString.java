
package conversor_strings.clases;

// NOTA: Genera un string con cadenas concatenadas mayores a N caracteres.

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ConcatString {
	// Atribs.
	// Natrix
	
	// Contruc.
	public ConcatString() {
		// Natrix
	}
	
	// Setters
	// Natrix
	
	// Getters
	// Natrix
	
	// Metods.
	public static String concatenar(ArrayList<String> str, int n) {
		ArrayList<String> tempList = new ArrayList<>(); String cadena = "";
		
		// Recorre...
		str.stream().forEach((elemento) -> {if (elemento.length() > n) {tempList.add(elemento);}});
		
		// Concatena...
		cadena = tempList.stream().collect(Collectors.joining(", "));
		
		return cadena;
	}
}
