package boletin2.jv;

public class Ejercicio4 {

	public static void main(String[] args) {
	String Cadena= "Hola mundo";
	String CadenaInvertida="";
	for(int i=1; i<=Cadena.length()-1; i++) {
		CadenaInvertida+=Cadena.charAt(i);
		CadenaInvertida+=Cadena.charAt(i-1);
	}
	System.out.println(CadenaInvertida);
  }
}
