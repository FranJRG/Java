package Exam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Historial {
private Map<LocalDate, Combinacion> sorteos;
	
	
	public Historial() {
		super();
		this.sorteos= new HashMap<>(); 
	}
	
	public boolean addSorteo(LocalDate fecha, Combinacion c) throws HistorialException {
		if(this.sorteos.containsKey(fecha)) {
			throw new HistorialException("Ya existe un sorteo para la fecha indicada");
		}
		this.sorteos.put(fecha, c);
		return true;
	}
	
	
	public boolean addSorteo(int year, int month, int day, Combinacion c) throws HistorialException{
		return addSorteo(LocalDate.of(year, month, day), c);
	}
	
	public boolean actualizarSorteo(LocalDate fecha, Combinacion c) throws HistorialException {
		if(!this.sorteos.containsKey(fecha)) {
			throw new HistorialException("No existe un sorteo para la fecha indicada");
		}
		this.sorteos.put(fecha, c);
		return true;
	}
	
	public boolean actualizarSorteo(int year, int month, int day, Combinacion c) throws HistorialException{
		return actualizarSorteo(LocalDate.of(year, month, day), c);
	}
	
	
	public boolean borrarSorteo(LocalDate fecha) throws HistorialException {
		if(!this.sorteos.containsKey(fecha)) {
			throw new HistorialException("No existe un sorteo para la fecha indicada");
		}
		this.sorteos.remove(fecha);
		return true;
	}
	
	
	public List<String> listarSorteosDesdeFecha(LocalDate fechaInicio){
		List<String> sorteos = new ArrayList<>();
		for(LocalDate f : this.sorteos.keySet()) {
			if(fechaInicio==null || f.isAfter(fechaInicio) ) {
				sorteos.add( f.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))+" "+
						this.sorteos.get(f).toString());
			}
		}
		
		return sorteos;
	}
	
	
	public List<String> mostrarHistorico(){
		return listarSorteosDesdeFecha(null);
	}
	
	public List<String> listarSorteosDesdeFechaOrdenados(LocalDate fechaInicio){
		List<LocalDate> listaFechas = new ArrayList<>();
		for(LocalDate f : this.sorteos.keySet()) {
			if(fechaInicio==null || f.isAfter(fechaInicio)) {
				listaFechas.add(f);
			}
		}
		Collections.sort(listaFechas);
		
		List<String> sorteos = new ArrayList<>();
		for(LocalDate f : listaFechas) {
			sorteos.add(this.sorteos.get(f).toString());
			
		}
		return sorteos;
	}
	
	public List<String> mostrarHistoricoOrdenado(){
		return listarSorteosDesdeFechaOrdenados(null);
	}
	
	public Map<String, Integer> comprobarAciertos(LocalDate fecha, Combinacion combinacion) throws HistorialException{
		Map<String, Integer> aciertos = new HashMap<>();
		
		if(!this.sorteos.containsKey(fecha)) {
			throw new HistorialException();
		}
		
		aciertos.put(fecha.format(DateTimeFormatter.ofPattern("MM-dd-yyyy")), 
				this.sorteos.get(fecha).comprobarCombinacion(combinacion));
		
		return aciertos;
	}
	
	public void calcularNumerosMasRepetidos() {
		List<Integer>numeros=new ArrayList<>();
		
		for (Combinacion c : this.sorteos.values()) {
			numeros.addAll(c.getNumeros());
		}
		
		Map<Integer,Integer>mapaFrecuencias=obtenerFrecuencias(numeros);
		
		int maximo=1;
		
		Set<Integer>repetidos=new HashSet<>();
		
		for(Integer numero: mapaFrecuencias.keySet()) {
			if(mapaFrecuencias.get(numero)==maximo) {
				repetidos.add(numero);
			}else if(mapaFrecuencias.get(numero)>maximo) {
				maximo=mapaFrecuencias.get(numero);
				repetidos.clear();
				repetidos.add(numero);
			}
		}
	}
	
	protected Map<Integer, Integer> obtenerFrecuencias(List<Integer>numero){
		Map<Integer,Integer>mapaFrecuencias=new HashMap<>();
		for (Integer i : numero) {
			if(!mapaFrecuencias.containsKey(i)) {
				mapaFrecuencias.put(i,0);
			}
			mapaFrecuencias.put(i,mapaFrecuencias.get(i)+1);
			
		}
		return mapaFrecuencias;
	}
}
