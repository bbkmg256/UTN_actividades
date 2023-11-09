
package ValidMatIns.clases;

import java.util.ArrayList;

public class Materia {
	// Atribs.
	private String nombreMateria;
	private ArrayList<Materia> materiasCorrelativas = new ArrayList<Materia>();

	// Const.
	public Materia() {
		// natrix
	}
	
	// Utilizado para las correlatividades...
	public Materia(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	
	// Setters
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	
	// Establece una correlatividad de una materia...
	public void setMateriaCorrelativa(Materia materiaCorrelativa) {
		this.materiasCorrelativas.add(materiaCorrelativa);
	}
	
	// Getters
	public String getNombreMateria() {
		return this.nombreMateria;
	}
	
	// Retorna el objeto...
	public ArrayList<Materia> getMateriasCorrelativas() {
		return this.materiasCorrelativas;
	}
	
	// Retorna un elemento de la lista...
	public Materia getMateriaCorrelativa(int pos) {
		return this.materiasCorrelativas.get(pos);
	}
	
	// Metods.
	// ...
}
