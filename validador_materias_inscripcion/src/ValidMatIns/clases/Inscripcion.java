
package ValidMatIns.clases;

public class Inscripcion {
	// Atribs.
	private Alumno alumno;
	private Materia materia;
	
	// Const.
	public Inscripcion() {
		// natrix
	}
	
	public Inscripcion(Alumno alumno, Materia materia) {
		this.alumno = alumno;
		this.materia = materia;
	}
	
	// Setters
	// ...
	
	// Getters
	// ...
	
	// Metods.
	public boolean aprobada() {
		if (this.alumno.getMateriasAprobadas().isEmpty()) {
			int aciertos = 0;
			
			// El problemita de esto es que intenta comprobar, aun sabiendo que algun elemento de materia no cumple...
			for (int i = 0; i < this.materia.getMateriasCorrelativas().size(); i++) {
				for (int j = 0; j < this.alumno.getMateriasAprobadas().size(); j++) {
					if (materia.getMateriaCorrelativa(i).getNombreMateria().equals(alumno.getMateriaAprobada(j).getNombreMateria())) {
						aciertos++;
					}
				}
			}
			
			if (aciertos >= materia.getMateriasCorrelativas().size()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public String nosi(boolean valor) {
		if (valor) {
			return "si";
		} else {
			return "no";
		}
	}
}
