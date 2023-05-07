package com.fjrg;

import java.util.Scanner;

public class Principal {

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
		
		int numero1;
		int numero2;
		
		System.out.println("Dime el primer numero: ");
		System.out.println("Dime el segundo número: "); 
		Scanner scann = new Scanner(System.in);
		numero1=Integer.valueOf(scann.nextLine());
		numero2=Integer.valueOf(scann.nextLine());
		
		if (numero1%numero2==0 && numero2%numero1==0) {
			System.out.println("Son múltiplos");
		}else {
			System.out.println("No son múltiplos");
		}
	
		int dia=0;
		 System.out.println("Dime el dia de la semana: ");
		 Scanner actividad3 = new Scanner(System.in);
		 dia=Integer.valueOf(actividad3.nextLine());
		 switch (dia) {
			 case 1 : {
				 System.out.println("Es lunes y toca Entornos de Desarrollo");
				 break;
			 }case 2 :{
				 System.out.println("Es martes y toca Fol");
				 break;
			 }case 3 :{
				 System.out.println("Es miércoles y toca Sistemas Informáticos");
				 break;
			 }case 4 :{
				 System.out.println("Es Jueves y toca Base de Datos");
				 break;
			 }case 5 :{
				 System.out.println("Es Viernes y toca Sistemas Informáticos");
				 break;
			 }default:{
				 System.out.println("¡Disfruta del fin de semana!");
			 }
		 }
		 
		 
	}

}


