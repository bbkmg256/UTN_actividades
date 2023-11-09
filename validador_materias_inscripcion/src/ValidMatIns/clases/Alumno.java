
package ValidMatIns.clases;

import java.util.ArrayList;

public class Alumno {
	// Atribs.
	private String nombre;
	private String apellido;
	private String DNI;
	private ArrayList<Materia> materiasAprobadas = new ArrayList<Materia>();
	
	// Const.
	public Alumno() {
		// natrix
	}
	
	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	// Carga solo un elemento a la lista...
	public void setMateriaAprobada(Materia materiaAprobada) {
		this.materiasAprobadas.add(materiaAprobada);
	}
	
	// Getters
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public String getDNI() {
		return this.DNI;
	}
	
	// retorna el objeto...
	public ArrayList<Materia> getMateriasAprobadas() {
		return this.materiasAprobadas;
	}
	
	// retorna un elemento de la lista...
	public Materia getMateriaAprobada(int pos) {
		return this.materiasAprobadas.get(pos);
	}
	
	// Metods.
	// ...
}
