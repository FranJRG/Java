package boletin2.jv;

public class Ejercicio9 {

	public static void main(String[] args) {
		System.out.println(toBinary(14));
		
	}
	public static String toBinary(int a) {
		int modulo;
		String binario="";
		while (a>0){
			modulo=a%2;
			binario=modulo+binario;
			a=a/2;
		}
		return binario;
	}
	
	
}
