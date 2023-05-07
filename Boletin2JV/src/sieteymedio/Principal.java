package sieteymedio;

public class Principal {

	public static void main(String[] args) {
		System.out.println(Palo.values());
		
		try {
			Baraja baraja = new Baraja();
			System.out.println();
		}catch(Exception e) {
			e.printStackTrace();
		}


	}

}
