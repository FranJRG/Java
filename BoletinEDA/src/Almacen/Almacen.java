package Almacen;

import java.util.Arrays;

public class Almacen {

	public static final int NUM_MAX_CAJAS=20;
	private Caja[] cajas;
	
	
	public Almacen() {
		super();
		this.cajas=new Caja[NUM_MAX_CAJAS];
		for(int i=0;i<NUM_MAX_CAJAS;i++) {
			this.cajas[i]=new Caja();
		}
	}
	
	public void abrirCaja(Caja caja) throws Exception {
		caja.abrirCaja();
	}
	
	private Caja buscarCaja(int id) {
		Caja caja=null;
		for(int i=0;i<NUM_MAX_CAJAS;i++) {
			caja=id==this.cajas[i].getId()? this.cajas[i]:null;
		}
		return caja;
	}
	
	public void cerrarCaja(Caja caja) throws Exception {
		caja.cerrarCaja();
	}
	
	private Caja obtenerCajaPrioritaria() {
		Arrays.sort(cajas);
		return cajas[0];
	}
	
	public void asignarClienteACaja(Cliente c) {
		
	}
	
	
	public String atenderCliente(int idCaja) throws Exception {
		return buscarCaja(idCaja).atenderCliente();
		
	}
	
}
