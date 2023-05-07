package boletin1.jv;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero=0;
		System.out.println("Dime un numero: ");
		numero=Integer.valueOf(sc.nextLine());
		int i=1;
		
		while (i<5) {
			i++;
			System.out.println("Dime un numero: ");
			numero=Integer.valueOf(sc.nextLine());
			if (numero%3==0) {
				System.out.println(numero);
			}	
			
		}
			
	}

}
