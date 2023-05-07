package boletin1.jv;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int edad=0;
		
		System.out.println("Cuántos años tienes: ");
		Scanner sc = new Scanner(System.in);
		edad = Integer.valueOf(sc.nextLine());
		
		if (edad < 18) {
			System.out.println("Eres menor de edad");
			System.out.println("Estas considerado un niño");
		}else if (edad>65) {
			System.out.println("Eres un anciano"); 
		}else {
			System.out.println("Eres mayor de edad");
			System.out.println("Eres un adulto");
		}

	}

}
