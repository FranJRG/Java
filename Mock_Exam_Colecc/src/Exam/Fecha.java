package Exam;

import java.util.Objects;

public class Fecha implements Comparable<Fecha> {
    private final int dia;
    private final int mes;
    private final int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public int compareTo(Fecha o) {
        if (this.anio != o.anio) {
            return this.anio - o.anio;
        } else if (this.mes != o.mes) {
            return this.mes - o.mes;
        } else {
            return this.dia - o.dia;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Fecha)) {
            return false;
        }
        Fecha otra = (Fecha) obj;
        return this.dia == otra.dia && this.mes == otra.mes && this.anio == otra.anio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, mes, anio);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", dia, mes, anio);
    }
}