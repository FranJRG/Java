package boletin1.jv;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salarios=0;

		
		float suma_salarios=0;
		int i=0;
		int i_salarios=0;
		
		do {
			i++;
			System.out.println("Introduce un salario: ");
			salarios=Float.valueOf(sc.nextLine());
			suma_salarios+=salarios;
			if (salarios>1000) {
				i_salarios++;
			}
		}while (i<10);
		System.out.println("La suma de los salarios es " +suma_salarios+ " y los salarios de más de 1000 euros son " +i_salarios);

	}

}
