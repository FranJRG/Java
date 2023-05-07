package sieteymedio;

public class Carta {

	private int numero;
	private Palo palo;
	
	public Carta(int numero, Palo palo) throws Exception {
		super();
		if(numero<1 || numero>12 || numero==8 || numero==9) {
			throw new Exception("Valor no válido");
		}
		this.numero=numero;
		this.palo=palo;
	}
	
	public double getValor() {
		return this.numero> 7? 0.5: this.numero;
	}
	
	
}
