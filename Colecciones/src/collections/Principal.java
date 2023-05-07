package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		List<String> listaNombres=new ArrayList<>();
		
		listaNombres.add("Rafael");
		listaNombres.add("Rafael");
		listaNombres.add("Iván");
		listaNombres.add("Iván");
		listaNombres.add("Salvador");
		listaNombres.add("Salvador");
		
		listaNombres.add(2, "Álvaro");
		listaNombres.set(2, "Alvaro");
		
		List<Integer> listaNumeros=new ArrayList();
		
		listaNumeros.add(3);
		listaNumeros.add(3);
		listaNumeros.add(3);
		
		Set<Object> conjuntoNombres=new HashSet<>();
		conjuntoNombres.addAll(listaNombres);
		conjuntoNombres.addAll(listaNumeros);
		
		System.out.println(listaNombres.size());
		System.out.println(listaNombres.toString());
		
		System.out.println(conjuntoNombres.size());
		System.out.println(conjuntoNombres);
	}

}
