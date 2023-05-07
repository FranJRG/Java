package Almacen;

public class Cliente {

	private static int secuencia=1;
	private int id;
	
	public Cliente() {
		super();
		this.id=secuencia++;
	}

	public int getId() {
		return id;
	}
	
}
