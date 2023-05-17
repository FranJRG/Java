package online;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		Catalogo series=new Catalogo();
			try {
				String nombre = "This is us";
				series.addSerie(nombre, 2015, Tema.DRAMA);
				series.addSerie("Friends", 1990, Tema.COMEDIA);
				series.addSerie("The big bang theory", 2007, Tema.COMEDIA);
				
				series.addSerie("Dallas", 1970, Tema.INTRIGA);
				series.addTemporada(nombre, "Empezamos");
				series.addTemporada("This is us", "Seguimos");
				series.addTemporada("This is us", "Finalizamos");
				
				System.out.println(series.listadoOrdenadoSerieDeUnTema(Tema.COMEDIA));
				
				
				series.addCapituloTemporada("This is us", "Empezamos", "La familia");
				series.addCapituloTemporada("This is us", "Empezamos", "El problema");
				series.addCapituloTemporada("This is us", "Empezamos", "Los niños");
				series.addCapituloTemporada("This is us", "Empezamos", "Casi el final");
				series.addCapituloTemporada("This is us", "Empezamos", "El final");
				
				series.guardarSeriesFicheros("./files");
				
			}catch(SerieException | IOException e){
				e.printStackTrace();
			}
	}

}
