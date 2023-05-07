package collections;

public class Entrada<K,V> {
	
	private K clave;
	private V valor;
	
	public Entrada(K clave, V valor) {
		super();
		this.clave=clave;
		this.valor=valor;
	}

	@Override
	public String toString() {
		return "Entrada [clave=" + clave + ", valor=" + valor + "]";
	}
	
	

}
