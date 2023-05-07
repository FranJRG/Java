package mapeando;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		
		List<Persona> personas=new ArrayList<>();
		
		Persona p1 = new Persona ("Juanito", "García", Genero.MASCULINO);
		Persona p2 = new Persona ("Adolfo", "Ramirez", Genero.MASCULINO);
		Persona p3 = new Persona ("Susana", "Moreno", Genero.FEMENINO);
		Persona p4 = new Persona ("Lucas", "Castro", Genero.MASCULINO);
		Persona p5 = new Persona ("Carmen", "Sanchez", Genero.FEMENINO);
		Persona p6 = new Persona ("Lucanor", "Hernandez", Genero.DESCONOCIDO);
		Persona p7 = new Persona ("Franchesca", "Marzan", Genero.NEUTRO);
		Persona p8 = new Persona ("Juanito", "García", Genero.MASCULINO);
		Persona p9 = new Persona ("Leticia", "Ordoñez", Genero.NEUTRO);
		Persona p10 = new Persona ("Manuela", "Rodriguez", Genero.FEMENINO);
		
		
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		personas.add(p5);
		personas.add(p6);
		personas.add(p7);
		personas.add(p8);
		personas.add(p9);
		personas.add(p10);
		
		System.out.println(Mapeando.mapearPersonasPorGenero(personas).toString());
		
		System.out.println(Mapeando.contarNumeros(Mapeando.generarNumerosAleatorios(1000)));
		
	}

}
