package sieteymedio;

public class Menu {

	public static void main(String[] args) {
		try {
			Baraja baj=new Baraja();
			
			baj.barajar();
			
			double puntuacionJ1=0;
			
			for (int i=0;i<4;i++) {
				Carta c = baj.dameCarta();
				puntuacionJ1+=c.getValor();
				System.out.println(c);
			}
			System.out.println(puntuacionJ1);
			
			System.out.println();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
