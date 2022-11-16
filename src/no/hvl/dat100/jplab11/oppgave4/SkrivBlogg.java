package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		try {
			
			PrintWriter skriv = new PrintWriter(mappe + filnavn);
			skriv.print(samling.toString());
			skriv.close();
			
			return true;
			
		}
		
		catch (FileNotFoundException e) {
			
			return false;
			
		}
		
	}
	
}
