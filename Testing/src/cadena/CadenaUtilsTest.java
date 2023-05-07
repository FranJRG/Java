package cadena;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaUtilsTest {

	@Test
	void testNoIsEmptyCuandoNull() {
		CadenaUtils c = new CadenaUtils(null);
		
		assertFalse(c.isEmpty());
	}
	
	
	@Test
	void testNoIsEmptyCuandoHayContenido() {
		CadenaUtils c = new CadenaUtils("ola ke ase");
		
		assertFalse(c.isEmpty());
	}
	
	@Test
	void testIsEmptyCuandoCadenaVacia() {
		CadenaUtils c = new CadenaUtils(" ");
		
		assertTrue(c.isEmpty());
	}
	
	@Test
	public void esNullCuandoCadenaNoAsignada() {
		CadenaUtils c = new CadenaUtils();
		
		assertTrue(c.isNull());
	}
	
	@Test
	public void noEsNullCuandoCadenaNoAsignada() {
		CadenaUtils c = new CadenaUtils("hola");
		
		assertFalse(c.isNull());
	}
	
	@Test
	public void isBlankCuandoCadenaAsignadaEsVacia() {
		CadenaUtils c = new CadenaUtils("");
		
		assertTrue(c.isNull());
	}
	
	@Test
	public void isBlankCuandoCadenaAsignadaContieneSoloEspacios() {
		CadenaUtils c = new CadenaUtils("        ");
		
		assertTrue(c.isNull());
	}
	
	@Test
	public void isBlankCuandoCadenaAsignadaNoEsVacia() {
		CadenaUtils c = new CadenaUtils("hola");
		
		assertFalse(c.isNull());
	}
	
	@Test
	public void isBlankCuandoNoCadenaAsignada() {
		CadenaUtils c = new CadenaUtils();
		
		assertFalse(c.isNull());
	}
}
