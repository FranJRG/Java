package boletin2.jv;

public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println(segundosEntre(12, 43, 50, 14, 21, 60));

	}
	public static int segundosEntre(int hora1, int minutos1, int segundos1, int hora2, int minutos2, int segundos2) {
		int total_segundos=0;
		if ((hora1<=24 && hora1>=0) && (hora2<=24 && hora2>0) && (minutos1<=60 && minutos1>=0) && (minutos2<=60 && minutos2>=0) && (segundos1<=60 && segundos1>=0) && (segundos2<=60 && segundos2>=0)) {
			if (segundos1>segundos2) {
				total_segundos=segundos1-segundos2;
			}else if (segundos2>segundos1) {
				total_segundos=segundos2-segundos1;
			}
		}else {
			total_segundos=-1000;
		}
		return total_segundos;
	}	
}
	