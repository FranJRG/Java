package boletin1.jv;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		System.out.println(calcularAreaCirculo(7));
		System.out.println(calcularLongitudCirculo(3));
	}
	public static double calcularAreaCirculo (double valor) {
		Scanner sc = new Scanner(System.in);
		double radio=0;
		if (valor>0) {
			radio = Math.PI*(valor*valor);
		}
		return radio;
		
	}
	public static double calcularLongitudCirculo (double radio) {
		Scanner scanner =new Scanner(System.in);
		double longitud=0;
		if (radio>0) {
			longitud = 2 * Math.PI * radio;
		}
		return longitud;
	}


}
