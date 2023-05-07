package Compare;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

public class Persona implements Comparable<Persona>{

	
	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private String personalID;
	
	public Persona(String name, String surname, String personalID, LocalDate dateOfBirth) {
		super();
		this.name=name;
		this.surname=surname;
		this.personalID=personalID;
		this.dateOfBirth=dateOfBirth;
	}
	
	public long getEdad() {
		return ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
	}
	
	
	
	@Override
	public String toString() {
		return "Persona [name=" + name + ", surname=" + surname + ", dateOfBirth=" + dateOfBirth + ", personalID="
				+ personalID + "]";
	}

	@Override
	public int compareTo(Persona otraPerson) {
		int resultado;
		
		if(this==otraPerson) {
			resultado=0;
		}else if(this.getEdad()<otraPerson.getEdad()) {
			resultado=1;
		}else {
			resultado=-1;
		}
		return resultado;
	}
	

}
