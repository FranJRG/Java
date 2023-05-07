package Compare;

import java.time.LocalDate;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		Persona[] personas = new Persona[4];
		
		personas[0]=new Persona("Adolfo", "Rodriguez", "AS45", LocalDate.of(2002, 5, 14));
		personas[1]=new Persona("Alfonso", "Ramirez", "AP78", LocalDate.of(2005, 2, 18));
		personas[2]=new Persona("Juan", "Galero", "VJ89", LocalDate.of(2000, 1, 28));
		personas[3]=new Persona("Matias", "Oliver", "KJ12", LocalDate.of(2003, 2, 15));
		
		
		Arrays.sort(personas);
		
		for(Persona p: personas) {
			
			if(p!=null) {
				System.out.println(p);
			}
			
		}
	}

}
