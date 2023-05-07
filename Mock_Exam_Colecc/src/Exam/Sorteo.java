package Exam;

import java.util.*;

public class Sorteo {
    private final Fecha fecha;
    private final List<Integer> numeros;
    private final List<Integer> estrellas;

    public Sorteo(Fecha fecha, List<Integer> numeros, List<Integer> estrellas) {
        this.fecha = fecha;
        this.numeros = numeros;
        this.estrellas = estrellas;
    }

	public Fecha getFecha() {
        return fecha;
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public List<Integer> getEstrellas() {
        return estrellas;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Sorteo)) {
            return false;
        }
        Sorteo otro = (Sorteo) obj;
        return this.fecha.equals(otro.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha);
    }

    @Override
    public String toString() {
        List<Integer> listaNumeros = new ArrayList<>(numeros);
        List<Integer> listaEstrellas = new ArrayList<>(estrellas);
        Collections.sort(listaNumeros);
        Collections.sort(listaEstrellas);
        return String.format("%s - Números: %s - Estrellas: %s", fecha, listaNumeros, listaEstrellas);
    }
}
