package sistema_parking;

import java.util.Arrays;

public class Parking {
	   	
	private Vehiculo[] vehiculos;
	private int numVehiculos;

	public Parking() {
	    this.vehiculos = new Vehiculo[50];
	     this.numVehiculos = 0;
	}

	public boolean entrarVehiculo(Vehiculo vehiculo) {
	    if (numVehiculos < 50) {
	          vehiculos[numVehiculos] = vehiculo;
	          numVehiculos++;
	          return true;
	    } else {
	          return false;
	    }
	}

	    public boolean salirVehiculo(Vehiculo vehiculo) {
	        for (int i = 0; i < numVehiculos; i++) {
	            if (vehiculos[i].equals(vehiculo)) {
	                vehiculos[i] = vehiculos[numVehiculos - 1];
	                vehiculos[numVehiculos - 1] = null;
	                numVehiculos--;
	                return true;
	            }
	        }
	        return false;
	    }

	    public Vehiculo[] getVehiculos() {
	        return vehiculos;
	    }

	    public void ordenarPorFechaEntrada() {
	        Arrays.sort(vehiculos, 0, numVehiculos);
	    }

	    public void ordenarPorMarcaModelo() {
	        Arrays.sort(vehiculos, 0, numVehiculos, Vehiculo.getMarcaModeloComparator());
	    }
}
