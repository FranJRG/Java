package boletin1.jv;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int numero=0;
		int cuadrado=0;
		System.out.println("Dime un numero: ");
		numero=Integer.valueOf(sc.nextLine());
		
		while (numero>0) {
			cuadrado=numero*numero;
			System.out.println(cuadrado);
			System.out.println("Dime un numero: ");
			numero=Integer.valueOf(sc.nextLine());
		}
		

	}

}
