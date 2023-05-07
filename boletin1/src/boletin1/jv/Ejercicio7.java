package boletin1.jv;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int horas=0;
		System.out.println("Introduce una hora: ");
		horas=Integer.valueOf(sc.nextLine());
		
		if (horas>=6 && horas<=12) {
			System.out.println("Buenos Días");
		}else if (horas>=13 && horas<=20) {
			System.out.println("Buenas Tardes");
		}else if (horas>20 && horas<=24 || horas<=5 && horas>0) {
			System.out.println("Buenas Noches");
		}else {
			System.out.println("La hora introducida no corresponde al tramo horario");
		}
		

	}

}
