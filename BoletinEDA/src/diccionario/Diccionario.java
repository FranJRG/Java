package diccionario;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Diccionario {

	private String nombre;
	private Map<String, HashSet<Significado>>palabras;
	
	public Diccionario(String nombre) {
		super();
		this.nombre=nombre;
		this.palabras=new HashMap<>();
	}
	
	
	public void añadirPalabra(String palabra, String significado) throws Exception {
		
		if(palabra!=null && significado!=null) {
			palabras.put(palabra, new HashSet<Significado>());
		}else {
			throw new Exception("No se puede añadir esta palabra");
		}
		
	}
	
	public void borrarPalabra(String palabra, String significado) throws Exception{
		if(palabra!=null) {
			palabras.remove(palabra, significado);
		}else {
			throw new Exception("La palabra buscada no se encuentra");
		}
	}
	
	public void buscarPalabra(String palabra) {
		
		for(int i=0;i<=palabra.length();i++) {
			if(palabras.containsKey(palabra) && palabra!=null) {
				palabras.get(palabra);
			}
		}
		
	}
	
	public void listadoPalabra(String comienzo, String palabra) throws Exception {
		for(int i=0;i<=comienzo.length();i++) {
			if(palabra.startsWith(comienzo) && palabras.containsKey(palabra)) {
				palabras.get(palabra);
			}else {
				throw new Exception("No hay ninguna palabra que comienze asi");
			}
		}
	}
	
	public String getNombre() {
		return nombre;
	}


	@Override
	public String toString() {
		return "El significado de la palabra es" + palabras;
	}
	
	
	
}
