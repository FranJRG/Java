package Exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fichero {

		public static void main(String[] args) throws NumberFormatException, HistorialException, CombinacionException {
				
				String cadena="Vival-el-betis";
				Historial h1=new Historial();
				
				File fichero3=new File("C:\\Users\\Usuario\\Desktop\\Euromillones 2004 a 2023.csv");
				try {
					
					FileReader reader=new FileReader(fichero3);
					BufferedReader buffer=new BufferedReader(reader);
					
					String linea=buffer.readLine();
					String[] combi=linea.split(",");
					
					while(linea!=null) {
						System.out.println(linea);
						linea=buffer.readLine();
						h1.addSorteo(LocalDate.parse(combi[0], DateTimeFormatter.ofPattern("DD/MM/YYYY")), new Combinacion(Integer.valueOf(combi[1]), Integer.valueOf(combi[2]), Integer.valueOf(combi[3]), Integer.valueOf(combi[4]), Integer.valueOf(combi[5]), Integer.valueOf(combi[6]), Integer.valueOf(combi[7])));
					}
				}catch(IOException e) {
					e.printStackTrace();
				}
				

		}

}

