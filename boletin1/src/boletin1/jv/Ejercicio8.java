package boletin1.jv;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia = 0;
		int mes = 0;
		System.out.println("Dime el día en el que te encuentras: "); 
		System.out.println("Dime el mes en el que nos encontramos: ");
		dia = Integer.valueOf(sc.nextLine());
		mes = Integer.valueOf(sc.nextLine());
		
		if (dia>=21 && (mes==12 ||mes==1 || mes==2 || (mes==3 && dia<20))) {
			System.out.println("La temperatura se ajustará a 19º");
		}else if (dia>=20 && (mes==3 || mes==4 || mes==5 || (mes==6 && dia<21))) {
			System.out.println("Primavera la temperatura se ajustará a 20º");
		}else if (dia>21 && (mes==6 || mes==7 || mes==8 || (mes==9 && dia<23))){
			System.out.println("Es verano la temperatura se ajustará a 21º");
		}else {
			System.out.println("La temperatura se ajustará a 19º");
		}
	}

}
