package boletin2.jv;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println(solucionesEcuacionSegundoGrado(2,-4,8));
		
	}
	public static String solucionesEcuacionSegundoGrado(int a, int b, int c) {
		double operacion= b*b -4 *a*c;
		String mensaje=" ";
		if (operacion<0) {
			mensaje+="-1";
		}else if (operacion!=0) {
			mensaje+="Tiene 2 resultados";
		}else {
			mensaje+="Tiene 1 resultado";
		}
		return mensaje;
	}
}
