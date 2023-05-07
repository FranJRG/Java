package boletin1.jv;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float numero=0;
		float numero_par=0;
		System.out.println("Dime un numero: ");
		numero=Integer.valueOf(sc.nextLine());
		numero_par=Integer.MIN_VALUE;
		
		int i=0;
		int imp=0;
		float numero_impar=0;
		float suma_impares=0;
		float media=0;
		
		while (numero>0) {
			i++;
			System.out.println("Dime un numero: ");
			numero=Integer.valueOf(sc.nextLine());
			if (numero%2==1) {
				imp++;
				suma_impares+=numero;
			}else if ((numero%2==0) && (numero>numero_par)) {
				numero_par=numero;
			}
		}
		media=suma_impares/imp;
		System.out.println("La cantidad de numero introducidos " +i+ " la media de los impares es " +media+ " y el numero par mas alto es " +numero_par);
	}
}
