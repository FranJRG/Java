package hisotrialnaveg;

import java.time.LocalDateTime;

	
public class PaginaWeb {
	
	    private String url;
	    private LocalDateTime fechaHora;


	    public PaginaWeb(String url) {
	        this.url = url;
	        this.fechaHora = LocalDateTime.now();
	    }

	    public PaginaWeb(String url, LocalDateTime fechaHora) {
	        this.url = url;
	        this.fechaHora = fechaHora;
	    }

	    public String getUrl() {
	        return url;
	    }

	    public LocalDateTime getFechaHora() {
	        return fechaHora;
	    }

	    public String toString() {
	  
	        return "Página: " + url + " Fecha y hora: " + fechaHora;
	    }
}



