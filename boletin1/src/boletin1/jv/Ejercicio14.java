package boletin1.jv;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero=0;
		System.out.println("Dime un numero: ");
		numero=Integer.valueOf(sc.nextLine());
		
		int i=0;
		
		while (numero>0) {
			i++;
			System.out.println("Dime un numero: ");
			numero=Integer.valueOf(sc.nextLine());
			if (numero<0) {
				System.out.println(i);
			}
		}

	}

}
