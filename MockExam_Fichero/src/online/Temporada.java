package online;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Temporada implements Comparable<Temporada>{
	
	private String nombreTemporada;
	private LinkedList<String> capitulos; 
	private int sumaOpiniones;  
	private int numeroOpiniones; 
	

	
	public Temporada(String nombreTemporada, int caps) {
		this.nombreTemporada=nombreTemporada;
		capitulos=new LinkedList<String>();
		sumaOpiniones=0;
		numeroOpiniones=0;
	}
	

	public void annadirCapitulo(String capitulo) {
		capitulos.add(capitulo);
	}
	

	
	public boolean eliminarCapitulo (String capitulo) {
		boolean borrado;
		borrado=capitulos.remove(capitulo);
		return borrado;
	}
	

	public void valorar( int nota)throws SerieException {
		if (nota < 0 || nota > 10) {
			throw new SerieException("Nota incorrecta "  + nota);
		}
		
		sumaOpiniones= sumaOpiniones + nota;
		numeroOpiniones++;
	}
	
	public double getNotaMedia() {
		double notaMedia=-1;
		if (numeroOpiniones==0) {
			notaMedia= sumaOpiniones/numeroOpiniones;
		}
		return notaMedia;
	}
	
	public String primerCapituloQueContieneEstaPalabra(String palabra) throws SerieException {
		
		if(!palabra.isBlank() && palabra!=null) {
			for (String caps : capitulos) {
				if(caps.contains(palabra)) {
					return caps;
				}
			}
		}
		throw new SerieException("No se ha encontrado ningun capitulo que comienze con esta palabra");
	}
	
	public void añadirCapituloDespues(String nombreCapituloAnnadir,String nombreCapituloAnterior) throws SerieException {
		
		int indice=capitulos.indexOf(nombreCapituloAnterior);
		
		if(nombreCapituloAnnadir!=null && indice!=-1) {
			capitulos.add(indice+1,nombreCapituloAnnadir);
		}else {
			throw new SerieException("No se encuentra el capitulo anterior");
		}
	
	}
	
	public List<String>obtenerInfoCapitulos(String serie){
		List<String>infoCaps=new ArrayList<>();
		for (String capitulo : this.capitulos) {
			infoCaps.add(serie+","+this.nombreTemporada+","+capitulo);
		}
		return infoCaps;
	}
	
	@Override
	public int compareTo(Temporada o) {
		return this.getNumeroCapitulos()-o.getNumeroCapitulos();
	}
	
	private int getNumeroCapitulos() {
		
		return 0;
	}


	public String toString() {
		String info;
	
		info=nombreTemporada+   " Número de capitulos " + capitulos.size() + 
					" Nota media " + getNotaMedia();
		return info;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreTemporada == null) ? 0 : nombreTemporada.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj||obj!=null && obj instanceof Temporada && this.hashCode()==this.hashCode();
	}
	
	public String getNombreTemporada() {
		return nombreTemporada;
	}
	
}

