package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	// Deklarering av objektvariabler:
	
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	//
	
	public Innlegg() {
		
	}

	// To konstruktører som initialiserer objektvariablene:
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	
	/* Implementerer Get-metoder som returnerer verdien på objektvariabelene.
	 * Implementerer også Set-metoder som setter verdi på objektvariabelene.*/
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		
		this.bruker = bruker;
		
	}

	public String getDato() {
		
		return dato;
		
	}

	public void setDato(String dato) {
		
		this.dato = dato;
		
	}

	public int getId() {
		
		return id;

	}
	
    public void setId(int id) {
		
		this.id = id;
		
	}
    
    public int getLikes() {
		
		return likes;

	}


    // Øker antall likes for innlegget med 1:
	
	public void doLike () {
		
		likes += 1;
		
	}
	
	// Returnerer true hvis innlegget har samme id gitt som parameter:
	
	public boolean erLik(Innlegg innlegg) {
		
		if(innlegg.getId() == this.id) {
			
			return true;
			
		}
		
		else {
		
			return false;
			
		}
		
	}
	
	// Implementerer en tekststreng med alle variablene:
	
	public String toString() {
		
		String tekst = id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
				
		return tekst;
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
