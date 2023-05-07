package boletin1.jv;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero=0;
		int numero_alto=0;
		int numero_bajo=0;
		System.out.println("Dime un numero: "); 
		numero=Integer.valueOf(sc.nextLine());
		numero_alto=Integer.MIN_VALUE;
		numero_bajo=Integer.MAX_VALUE;
		int i=0;
		
		while (i<10) {
			System.out.println("Dime un numero: ");
			numero=Integer.valueOf(sc.nextLine());
			i++;
			if (numero>numero_alto) {
				numero_alto=numero; 
			}
			if (numero<numero_bajo) {
				numero_bajo=numero;
			}
		}
		System.out.println("El numero mas alto " +numero_alto+ " el numero más bajo es " +numero_bajo );
	}	

}
