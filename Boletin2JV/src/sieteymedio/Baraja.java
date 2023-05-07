package sieteymedio;

import java.util.concurrent.ThreadLocalRandom;

public class Baraja {

	private Carta[] cartas;
	
	private static final int MAX_SIZE=40;
	private int siguiente;
	
	public Baraja() throws Exception {
		
		this.cartas=new Carta[MAX_SIZE];
		
		int cont_carta=0;
		
		for(Palo p: Palo.values()) {
			for(int i=1; i<13; i++) {
				if(!(i!=8 || i!=9)) {
					this.cartas[cont_carta++]=new Carta(i,p);
				}
			}
		}
	}
	
	public Carta dameCarta() {
		return this.cartas[siguiente++%MAX_SIZE];
	}
	
	public void barajar() {
		this.siguiente=0;
		for(int i=0;i<MAX_SIZE;i++) {
			int numeroAleatorio_1=getNumeroAleatorio();
			int numeroAleatorio_2=getNumeroAleatorio();
			
			Carta tempo=this.cartas[numeroAleatorio_2];
			this.cartas[numeroAleatorio_2]=this.cartas[numeroAleatorio_1];
			this.cartas[numeroAleatorio_1]=tempo;
		}
	}
	
	public int getNumeroAleatorio() {
		return ThreadLocalRandom.current().nextInt(0, MAX_SIZE);
	}
	
	
	
	
}
