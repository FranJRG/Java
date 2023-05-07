package notas;

import java.time.LocalDateTime;
import java.util.Objects;

public class Nota implements compareTo <Nota>{

	private static int codigoSiguiente;
	private int codigo;
	private String texto;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	
	
	public Nota(int codigo, String texto, LocalDateTime fechaCreacion, LocalDateTime fechaUltimaModificacion) {
		super();
		this.codigo=codigo;
		this.texto=texto;
		this.fechaCreacion=fechaCreacion;
		this.fechaUltimaModificacion=fechaUltimaModificacion;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto=texto;
	}

	public int getCodigo() {
		return codigo;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDateTime getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	
	public boolean isModificado() {
		
		boolean modificado=false;
		
		if(fechaCreacion!=null && fechaUltimaModificacion!=null && fechaCreacion.isBefore(fechaUltimaModificacion)) {
			modificado=true;
		}
	return modificado;
	}
	
	public boolean isEmpty() {
		boolean esVacio=false;
		
		if(texto.isEmpty() && texto!=null) {
			esVacio=true;
		}
	return esVacio;
	}
	
	public boolean isCreadoAnterior(Nota note) {
		boolean esAnterior=false;
		
		if(note.fechaCreacion.isBefore(fechaCreacion)) {
			esAnterior=true;
		}
		
		return esAnterior;
	}
	
	public boolean isModificadoAnterior(Nota note) {
		boolean fueModificado=false;
		
		if(note.fechaUltimaModificacion.isBefore(fechaUltimaModificacion)) {
			fueModificado=true;
		}
		
		return fueModificado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, fechaCreacion, fechaUltimaModificacion, texto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		return codigo == other.codigo && Objects.equals(fechaCreacion, other.fechaCreacion)
				&& Objects.equals(fechaUltimaModificacion, other.fechaUltimaModificacion)
				&& Objects.equals(texto, other.texto);
	}
	
	
	
}
