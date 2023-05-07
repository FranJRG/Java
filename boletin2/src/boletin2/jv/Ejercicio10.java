package boletin2.jv;

public class Ejercicio10 {

	public static void main(String[] args) {
		System.out.println(minimoComunMultiplo(24, 36));
		System.out.println(gcd(24,36));

	}
	public static double gcd(double a, double b) {
		while (b!=0) {
			if (a>b) {
				a=a-b;
			}else {
				b=b-a;
			}
		}
		return a;
	}
	public static double minimoComunMultiplo(int a, int b) {
		double mcm= (a*b)/gcd(a,b);
		return mcm;
	}
	
}
