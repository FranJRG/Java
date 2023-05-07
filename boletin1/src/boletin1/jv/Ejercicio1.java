package boletin1.jv;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		
		System.out.println("Dime el primer numero: ");
		System.out.println("Dime el segundo número: "); 
		Scanner scann = new Scanner(System.in);
		numero1=Integer.valueOf(scann.nextLine());
		numero2=Integer.valueOf(scann.nextLine());
		
		if (numero1>numero1 && numero1%numero2==0) {
			System.out.println("Son múltiplos");
		}else if (numero2>numero1 && numero2%numero1==0) {
			System.out.println("Son múltiplos");
		}else {
			System.out.println("No son múltiplos");
		}

	}

}
