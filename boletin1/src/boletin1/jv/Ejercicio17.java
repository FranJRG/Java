package boletin1.jv;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena = "";
		int suma_numero=0;
		
		while(!cadena.equals("fin")) {
			System.out.println("Introduce un número");
			cadena=sc.nextLine();
			
			if(!cadena.equals("fin")) {
				suma_numero+=Integer.valueOf(cadena);
			}
		}
		System.out.println(suma_numero);
	}

}
