package online;

import java.util.ArrayList;

public class Serie {
	private static final int ANNO_MINIMO = 1900; 
	private String nombreSerie; 
	private int anno; 
	private Tema tema; 
	private ArrayList<Temporada> temporadas; 
	
	
	public Serie(String nombreSerie, int anno, Tema tema) throws SerieException {
		super();
		this.nombreSerie = nombreSerie;
		setAnno(anno);
		this.tema = tema;
		temporadas=new ArrayList<Temporada>();
	}
	

	public void annadirTemporada( String nombreTemporada) throws SerieException {
		
		for (Temporada temporada : temporadas) {
			if(temporada!=null && !temporada.equals(nombreTemporada)) {
				temporadas.add(temporada);
			}else {
				throw new SerieException("La temporada añadida ya existe");
			}
		}
		
	}
	
	public void annadirCapituloTemporada( String nombreTemporada, String nombreCapitulo) throws SerieException {
		Temporada temporada = new Temporada(nombreTemporada, anno);
		int pos = temporadas.indexOf(temporada);
		if (pos == -1) {
			throw new SerieException("No existe la temporada");
		}
		temporadas.get(pos).annadirCapitulo(nombreCapitulo);
	}
	
	

	
	public void valorarTemporada(String nombreTemporada, int valoracion) throws SerieException {
		Temporada temporada = new Temporada(nombreTemporada, valoracion);
		int pos = temporadas.indexOf(temporada);
		if (pos == -1) {
			throw new SerieException("No existe la temporada");
		}
		temporadas.get(pos).valorar(valoracion);
		
	}

	public String getNombreSerie() {
		return nombreSerie;
	}



	public void setNombreSerie(String nombreSerie) {
		this.nombreSerie = nombreSerie;
	}


	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) throws SerieException {
		if ( anno < ANNO_MINIMO) {
			throw new SerieException("Anno incorrecto");
		}
		this.anno = anno;
	}


	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	

	public int numeroTemporadas() {
		return temporadas.size();
	}


	public String toString() {
		return  String.format("%s,%s,%s",this.nombreSerie,this.anno,this.tema.toString().toLowerCase());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreSerie == null) ? 0 : nombreSerie.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		if (nombreSerie == null) {
			if (other.nombreSerie != null)
				return false;
		} else if (!nombreSerie.equals(other.nombreSerie))
			return false;
		return true;
	}	
}
