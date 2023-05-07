package equipos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoTests {

	@Test
	void testAñadirAlumno() {
		
		Equipo a= new Equipo("Betis");
		Alumno b1=new Alumno("Fran", "12457821D");
		
		try {
			a.añadirAlumno(b1);
			
		}catch(Exception e){
			
			assert(false);
		}
	
	}
	
	@Test
	void testBorrarAlumno() {
		Equipo a= new Equipo("Betis");
		Alumno b1=new Alumno("Fran", "12457821D");
		
		try {
			a.borrarAlumno(b1);
		}catch(Exception e){
			assert(false);
		}
	}

}
