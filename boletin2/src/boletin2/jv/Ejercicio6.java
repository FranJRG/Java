package boletin2.jv;

public class Ejercicio6 {

	public static void main(String[] args) {
		System.out.println(esMultiplo(14,2));
		
	}
	public static boolean esMultiplo(int numero1, int numero2) {
		boolean multiplo;
		
		if ((numero1>numero2) && (numero1%numero2==0)) {
			System.out.println("El " + numero1 + " es multiplo de "+ numero2);
			multiplo=true;
		}else if ((numero2>numero1) && (numero2%numero1==0)) {
			System.out.println("El" + numero2 + " es multiplo de "+ numero1);
			multiplo=true;
		}else {
			System.out.println("El numero introducito no se puede calcular");
			multiplo=false;
		}
		
		return multiplo;
	}	
}
