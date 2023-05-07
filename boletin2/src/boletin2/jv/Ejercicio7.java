package boletin2.jv;

public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println (horaMayor(22, 45, 60, 1, 59, 45));
	}
	
	public static int horaMayor(int hora1, int minutos1, int segundos1, int hora2, int minutos2, int segundos2) {
		int valor=0;
		if ((hora1<=24 && hora1>=0) && (hora2<=24 && hora2>0) && (minutos1<=60 && minutos1>=0) && (minutos2<=60 && minutos2>=0) && (segundos1<=60 && segundos1>=0) && (segundos2<=60 && segundos2>=0)) {
			if (hora1>hora2) {
				valor=1;
			}else if (hora1==hora2) {
				if(minutos1>minutos2) {
					valor=1;
				}else if ((minutos1==minutos2) && (segundos1>segundos2)) {
					valor=1;
				}else {
					valor=2;
				}
			}else if (hora2>hora1) {
				valor=2;
			}else if (hora1==hora2 && minutos1==minutos2 && segundos1==segundos2) {
				valor=0;
			}
		}else {
			valor=-1000;
		}
		return valor; 
	}

}
