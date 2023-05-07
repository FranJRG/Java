package boletin2.jv;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println(numeroReves(987654321));

	}
	public static int numeroReves(int numero) {
		int invertido=0;
		int resto;
		while(numero>0) {
			resto=numero%10;
			invertido=invertido*10+resto;
			numero/=10;
			
		}
		return invertido;
		
	}

}

