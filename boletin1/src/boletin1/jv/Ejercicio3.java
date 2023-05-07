package boletin1.jv;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int mes=0;
		int año=0;
		
		System.out.println("Dime un mes: ");
		System.out.println("Dime un año: ");
		Scanner scanner = new Scanner(System.in);
		mes = Integer.valueOf(scanner.nextLine());
		año = Integer.valueOf(scanner.nextLine());
		
		if (mes==9 || mes==4 || mes==6 || mes==11) {
			System.out.println("Tiene 30 dias");
		}else if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			System.out.println("Tiene 31 dias");
		}else if (mes==2 && año%4!=0) {
			System.out.println("Tiene 28 dias");
		}else if (mes==2 && año%4==0 && (año%100!=0 || año%400==0)) {
			System.out.println("Es un año bisiesto y tiene 29 dias");
		}else {
			System.out.println("El mes introducido no es válido");
		}

	}

}
