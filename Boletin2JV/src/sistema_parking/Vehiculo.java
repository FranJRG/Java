package sistema_parking;
import java.time.LocalDateTime;
import java.util.Comparator;



public class Vehiculo implements Comparable<Vehiculo> {
    private String marca;
    private String modelo;
    private String matricula;
    private Combustible combustible;
    private LocalDateTime fechaEntrada;
    private TipoVehiculo tipo;

    public Vehiculo(String marca, String modelo, String matricula, Combustible combustible, LocalDateTime fechaEntrada, TipoVehiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.combustible = combustible;
        this.fechaEntrada = fechaEntrada;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    @Override
    public int compareTo(Vehiculo o) {
        return fechaEntrada.compareTo(o.fechaEntrada);
    }

    public static Comparator<Vehiculo> getMarcaModeloComparator() {
        return Comparator.comparing(Vehiculo::getMarca)
                .thenComparing(Vehiculo::getModelo);
    }

    public static Comparator<Vehiculo> getTipoCombustibleComparator() {
        return Comparator.comparing(Vehiculo::getTipo)
                .thenComparing(Vehiculo::getCombustible);
    }

    public static Comparator<Vehiculo> getMatriculaComparator() {
        return Comparator.comparing(Vehiculo::getMatricula);
    }
}
	
	
	
	

	
	
	

