package Exam;

import java.util.*;

public class Euromillon {
	    
	    private Map<Date, List<Sorteo>>sorteos ;
	    
	    public Euromillon() {
	        sorteos = new HashMap<>();
	    }
	    
	    public boolean addSorteo(Date fecha, List<Integer> numeros, List<Integer> estrellas) throws Exception {
	        if (numeros.size() != 5 || estrellas.size() != 2) {
	            throw new Exception("El número de números y estrellas debe ser 5 y 2, respectivamente.");
	        }
	        Set<Integer> numerosUnicos = new HashSet<>(numeros);
	        Set<Integer> estrellasUnicas = new HashSet<>(estrellas);
	        if (numerosUnicos.size() != 5 || estrellasUnicas.size() != 2) {
	            throw new Exception("Los números y las estrellas no pueden repetirse.");
	        }
	        Sorteo sorteo = new Sorteo(null, numeros, estrellas);
	        List<Sorteo> sorteosFecha = sorteos.get(fecha);
	        if (sorteosFecha == null) {
	            sorteosFecha = new ArrayList<>();
	            sorteos.put(fecha, sorteosFecha);
	        }
	        return sorteosFecha.add(sorteo);
	    }
	    
	    public boolean actualizarSorteo(Date fecha, List<Integer> numeros, List<Integer> estrellas) throws Exception {
	        if (numeros.size() != 5 || estrellas.size() != 2) {
	            throw new Exception("El número de números y estrellas debe ser 5 y 2, respectivamente.");
	        }
	        Set<Integer> numerosUnicos = new HashSet<>(numeros);
	        Set<Integer> estrellasUnicas = new HashSet<>(estrellas);
	        if (numerosUnicos.size() != 5 || estrellasUnicas.size() != 2) {
	            throw new Exception("Los números y las estrellas no pueden repetirse.");
	        }
	        List<Sorteo> sorteosFecha = sorteos.get(fecha);
	        if (sorteosFecha == null) {
	            throw new Exception("No hay sorteos para la fecha especificada.");
	        }
	        Sorteo sorteo = new Sorteo(null, numeros, estrellas);
	        int index = sorteosFecha.indexOf(sorteo);
	        if (index == -1) {
	            throw new Exception("No se encontró el sorteo para la fecha y los números y estrellas especificados.");
	        }
	        sorteosFecha.set(index, sorteo);
	        return true;
	    }
	    
	    public boolean borrarSorteo(Date fecha, List<Integer> numeros, List<Integer> estrellas) throws Exception {
	        if (numeros.size() != 5 || estrellas.size() != 2) {
	            throw new Exception("El número de números y estrellas debe ser 5 y 2, respectivamente.");
	        }
	        Set<Integer> numerosUnicos = new HashSet<>(numeros);
	        Set<Integer> estrellasUnicas = new HashSet<>(estrellas);
	        if (numerosUnicos.size() != 5 || estrellasUnicas.size() != 2) {
	            throw new Exception("Los números y las estrellas no pueden repetirse.");
	        }
	        List<Sorteo> sorteosFecha = sorteos.get(fecha);
	        if (sorteosFecha == null) {
	            throw new Exception("No hay sorteos para la fecha especificada.");
	        }
	        Sorteo sorteo = new Sorteo(null, numeros, estrellas);
	        return sorteosFecha.remove(sorteo);
	    }
}
