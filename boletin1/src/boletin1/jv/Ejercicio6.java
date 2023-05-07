package boletin1.jv;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		double notap=0;
		double notapb=0;
		double notat=0;
		System.out.println("¿Cual es la nota de la parte práctica: ");
		System.out.println("¿Cual es la nota de la parte de problemas: ");
		System.out.println("¿Cual es la nota de la parte teórica: ");
		Scanner sc = new Scanner(System.in);
		notap = Float.valueOf(sc.nextLine());
		notapb = Float.valueOf(sc.nextLine());
		notat = Float.valueOf(sc.nextLine());
		
		if ((notap>=0 || notap<=10) || (notapb>=0 || notapb<=10) || (notat>=0 || notat<=10)) {
			double notatotal = ((notap*0.1) + (notapb*0.5) + (notat*0.4));
			System.out.println(notatotal);
			if (notatotal<5) {
				System.out.println("Tienes un Insuficiente");
			}else if (notatotal>=5 && notatotal<6) {
				System.out.println("Tienes un Suficiente");
			}else if (notatotal>=6 && notatotal<7) {
				System.out.println("Tienes un Bien");
			}else if (notatotal>=7 && notatotal<=8) {
				System.out.println("Tienes un Notable");
			}else if (notatotal>=9 && notatotal<=10) {
				System.out.println("Tienes un Sobresaliente, ¡Enhorabuena!");
			}
		}else {
			System.out.println("La nota introducida no existe");
		}
	}
}
