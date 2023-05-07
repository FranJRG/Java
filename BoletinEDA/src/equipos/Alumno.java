package equipos;

import java.util.Objects;

public class Alumno {

	public String nombre;
	public String dni;
	public static final int MAYOR_EDAD=18;
	

	
	
	public Alumno(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "El nombre del alumno es " + nombre + ", con dni " + dni;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}

	
	public boolean equals(Object obj) {
		return this==obj || ((obj!=null && obj instanceof Alumno)) && Objects.equals(this.dni, ((Alumno)obj).dni)  
				&& Objects.equals(this.nombre, ((Alumno)obj).nombre); 
	}
	
	
	
}
