package boletin1.jv;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int numero=0;
		int suma_numero=0;
		System.out.println("Dime un número: ");
		numero=Integer.valueOf(sc.nextLine());
		
		int i=1;
		
		while(i<15) {
			suma_numero+=numero;
			i++;
			System.out.println("Dime un número: ");
			numero=Integer.valueOf(sc.nextLine());
		}
		System.out.println(suma_numero); 
	}

}


