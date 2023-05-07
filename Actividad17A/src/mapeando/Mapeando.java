package mapeando;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Mapeando {

	
	
	
	/**
	 * Recibe una colección de personas y las agrupa por género
	 * @param personas
	 * @return Mapa con la colección de personas clasificadas por género
	 */
	public static Map mapearPersonasPorGenero(Collection<Persona> personas) {
		Map<Genero, Set<Persona>> person = new HashMap<>();
		
		for(Persona p: personas) {
			if(p!=null && !person.containsKey(p.getGenero())) {
				person.put(p.getGenero(), new HashSet<Persona>());
				person.get(p.getGenero()).add(p);
			}else {
				person.get(p.getGenero()).add(p);
			}
		}
		
		return person;
	}
	
	
	/**
	 * Recibe una colección de números y cuenta cuantas ocurrencias hay de cada uno de ellos
	 * creando un mapa en el que aparece cada número junto a su frecuencia de aparición
	 * @param numeros
	 * @return Tabla de frecuencias de los números facilitados
	 */
	public static Map<Integer, Integer> contarNumeros(Collection<Integer> numeros){
		
		Map<Integer, Integer>numbers=new HashMap<>();
		
		for(Integer inte: numeros) {
			if(inte!=null && !numbers.containsKey(inte)) {
				numbers.put(inte, 1);
			}else {
				numbers.put(inte, numbers.get(inte)+1);
			}
			
			
		}
		
		return numbers;
	}
	
	
	/**
	 * Genera una lista de números aleatorios entre 0 y 20 del tamaño indicado
	 * @param size tamaño de la lista
	 * @return lista de size números aleatorios
	 */
	public static Collection<Integer> generarNumerosAleatorios(int size){
		List<Integer> numeros = new ArrayList<>() {{
			for(int i=0; i<size; i++) {
				add(new Random().nextInt(0, 20));
			}
		}};
		
		return numeros;
	}
}