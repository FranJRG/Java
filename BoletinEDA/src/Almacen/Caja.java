package Almacen;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Caja  implements Comparable<Caja> {

	private List<Integer>clientes;
	private boolean abierta;
	private static int siguiente=0;
	private int id;
	
	public Caja() {
		super();
		this.id=siguiente++;
		this.abierta=false;
		clientes=new ArrayList<>();
	}
	
	public void abrirCaja() throws Exception {
		if(!abierta) {
			abierta=true;
		}else {
			throw new Exception("La caja ya estaba abierta");
		}
	}
	
	public void cerrarCaja() throws Exception {
		if(!abierta && this.clientes.isEmpty()) {
			abierta=false;
		}else{
			throw new Exception("La caja no se puede cerrar");
		}
	}
	
	public void encolaCliente(Integer c) {
		this.clientes.add(c);
	}
	
	
	public int getNumeroClientes() {
		return this.clientes.size();
	}
	
	public String atenderCliente()throws Exception{
		String mensaje=" ";
		if(!abierta || this.clientes.isEmpty()) {
			throw new Exception("No se puede atender clientes");
		}else{
			mensaje=String.format("Se ha atendido al cliente con número %s", this.clientes.get(0));
			this.clientes.remove(0);
		}
		return mensaje;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public int compareTo(Caja o) {
		return getNumeroClientes()==o.getNumeroClientes()? getId()-o.getId():
			getNumeroClientes()-o.getNumeroClientes();
	}

	@Override
	public int hashCode() {
		return Objects.hash(abierta, clientes, id);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null && obj instanceof Caja c && c.hashCode()==this.hashCode();
	}
	
	
	
	
	
}
