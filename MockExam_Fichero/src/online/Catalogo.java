package online;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalogo {

	private static final String FICHEROS_SERIES_CSV = "ficheros Serie.csv";
	Map<String,Serie>mapSeries=new HashMap<>();

	public Catalogo() {
		mapSeries=new HashMap<String,Serie>();
	}
	
	public void addSerie(String nombreSerie, int capitulos,Tema tipo) throws SerieException {
		if(mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("La serie ya existe en el sistema");
		}
		Serie serie=new Serie(nombreSerie,capitulos,tipo);
		mapSeries.put(serie.getNombreSerie(), serie);
	}
	
	public void addTemporada(String nombreSerie,String temporada)throws SerieException{
		if(mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("La temporada ya existe");
		}
		Serie serie=mapSeries.get(nombreSerie);
		serie.annadirTemporada(temporada);
	}
	
	public void addCapituloTemporada(String capitulos,String nombreTemporada, String nombreSerie) throws SerieException {
		if(!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("El nombre de la serie no existe");
		}
		Serie serie=mapSeries.get(nombreSerie);
		serie.annadirCapituloTemporada(nombreTemporada, capitulos);
	}
	
	public void valorarTemporada(String nombreTemporada,String nombreSerie,int valoracion) throws SerieException {
		if(!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("El nombre de la serie no existe");
		}
		Serie serie=mapSeries.get(nombreSerie);
		serie.valorarTemporada(nombreTemporada, valoracion);
	}
	
	public int numeroDeTemporadasDeUnaSerie(String nombreSerie) throws SerieException {
		if(!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("El nombre de la serie no existe");
		}
		return this.mapSeries.get(nombreSerie).numeroTemporadas();
	}
	
	public void modificarTema(String nombreSerie,Tema tipo) throws SerieException {
		if(!mapSeries.containsKey(nombreSerie) || this.mapSeries.get(nombreSerie).getTema().equals(tipo)) {
			throw new SerieException("El nombre de la serie no existe");
		}
		this.mapSeries.get(nombreSerie).setTema(tipo);
	}
	
	public String listadoOrdenadoSerieDeUnTema(Tema tipo) {
		List<Serie>tmp=new ArrayList<>(this.mapSeries.values());
		tmp.sort(new SerieYearComparator());
		
		StringBuilder sb=new StringBuilder();
		for (Serie serie : tmp) {
			if(serie.getTema().equals(tipo) || tipo==null) {
				sb.append(serie).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	
	public void guardarSeriesFicheros(String path) throws IOException {
		File fichero=new File(path+FICHEROS_SERIES_CSV);
		fichero.createNewFile();
		
		FileWriter writer=new FileWriter(fichero);
		PrintWriter printer=new PrintWriter(writer);
		
		printer.println("nombreSerie,anno,tema");
		for (Serie serie : this.mapSeries.values()) {
			printer.println(serie);
		}
		
		printer.close();
		writer.close();
	}
	
	
	
}
