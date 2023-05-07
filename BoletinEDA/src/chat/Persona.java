package chat;

public abstract class Persona<T> {
	
	private static final int MAYOR=18;
	private String nombre;
	private int edad;
	
	
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}


	protected abstract void enviarMensaje(Persona<?>p,String mensaje);

}
