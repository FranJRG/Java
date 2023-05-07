package equipos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {

	public String nombreEquipo;
	private List<Alumno>alumno;

	
	public Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.alumno=new ArrayList<Alumno>();
	}

	public void añadirAlumno(Alumno a) throws Exception {
		
		boolean añadir=true;
		for (Alumno alumno2 : this.alumno) {
			if(alumno2.equals(a)) {
				añadir=false;
			}
		}
		
		if(añadir=true) {
			alumno.add(a);
		}else {
			throw new Exception("El alumno ya existe en el sistema");
		}
	}
	
	public void borrarAlumno(Alumno a) throws Exception {
		
		boolean borrar=true;
		for (Alumno alumno2 : this.alumno) {
			if(alumno2.equals(a)) {
				borrar=false;
			}
		}
		if(borrar=true) {
			alumno.remove(a);
		}else {
			throw new Exception("No se puede borrar un alumno que no existe");
		}
	}
	
	public Alumno perteneceEquipo(Alumno a) throws Exception{
		
		boolean pertenece=false;
		Alumno al=null;
		
		for (Alumno alumno2 : this.alumno) {
			if(alumno2!=null && alumno2.equals(a)) {
				pertenece=true;
			}
		}
		if(pertenece) {
			al=a;
		}else {
			throw new Exception("El alumno no pertenece a ningun equipo");
		}
	return al;
	}
	
	public Equipo unirEquipo(Equipo a) throws Exception {
		
		Equipo b=new Equipo("Real Betis");
		for (Alumno alumno2 : alumno) {
			if(alumno2!=null) {
				a.alumno.add(alumno2);
			}
		}
		
		for (Alumno alumno2 : alumno) {
			if(alumno2!=null && !alumno2.equals(b.perteneceEquipo(alumno2))) {
				a.alumno.add(alumno2);
			}
		}
		
	return b;
	}
	
	
	public String toString() {
		
		StringBuilder sb=new StringBuilder();
		
		for (Alumno alumno2 : alumno) {
			if(alumno!=null) {
				sb.append(alumno);
			}
		}
	return sb.toString();
	}
	
}
