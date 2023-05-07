package cadena;

public class CadenaUtils {
	
	public String cadena;
	
	public CadenaUtils() {
		
	}
	
	public CadenaUtils(String cadena) {
		this.cadena=cadena;
	}
	
	public boolean isEmpty() {
		return this.cadena!=null && this.cadena.length()==0;
	}
	
	public boolean isNull() {
		return this.cadena==null;
	}
	
	public boolean isBlank() {
		return !isNull() && this.cadena.trim().length()==0;
	}
	
}
