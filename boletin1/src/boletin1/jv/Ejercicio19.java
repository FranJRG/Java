package boletin1.jv;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rango=0;
		int numero1=1;
		int numero2=0;
		int contador=1;
		
		System.out.println("Cantidad de números a introducir: ");
		rango= sc.nextInt();
		
		while(contador<=rango) {
			contador++;
			numero1=numero2+numero1;
			numero2=numero1+numero2;
			System.out.println(numero1);
			System.out.println(numero2);
		}
		
	}

}
