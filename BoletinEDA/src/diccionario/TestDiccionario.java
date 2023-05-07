package diccionario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDiccionario {

	@Test
	void testAñadirPalabra() {
		Diccionario d1= new Diccionario("Almedra");
		
		try {
			d1.añadirPalabra("Semilla", "De donde nacen los arboles");
		}catch(Exception e) {
			assert(false);
		}
	}
	
	@Test
	void testBorrarPalabra() {
		Diccionario d1= new Diccionario("Almedra");
		
		try {
			d1.borrarPalabra("Semilla", "De donde nacen los arboles");
		}catch(Exception e) {
			assert(false);
		}
	}

}
