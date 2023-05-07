package boletin1.jv;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		 
		 System.out.println("Dime el dia de la semana: ");
		 Scanner actividad3 = new Scanner(System.in);
		 String dia = actividad3.nextLine();
		 
		if (dia.equals("Lunes")) {
			 System.out.println("Toca Entorno de Desarrollo");
		}else if (dia.equals("Martes")) {
			 System.out.println("Toca Fol");
		}else if (dia.equals("Miercoles") || dia.equals("Viernes")) {
			System.out.println("Toca Sistemas Informáticos");
		}else if (dia.equals("Jueves")) {
			System.out.println("Toca Base de Datos");
		}else if (dia.equals("Sábado") || dia.equals("Domingo")){
			System.out.println("¡Disfruta del Fin de Semana!");
		}else {
			System.out.println("El dia introducio no existe");
		}
	}

}
