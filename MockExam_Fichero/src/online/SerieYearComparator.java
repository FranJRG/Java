package online;

import java.util.Comparator;

public class SerieYearComparator implements Comparator<Serie>{

	@Override
	public int compare(Serie o1, Serie o2) {
		int resultado=0;
		
		if(o1!=null || o2!=null) {
			resultado=o1.getAnno()-o2.getAnno();
		}else if(o1==null) {
			resultado=1;
		}else {
			resultado=-1;
		}
		return resultado;
	}
	
	
	
}
