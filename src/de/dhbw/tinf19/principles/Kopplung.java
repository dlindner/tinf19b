package de.dhbw.tinf19.principles;

import java.util.ArrayList;
import java.util.Collection;

public class Kopplung {
	
	public static void main(String[] args) {
		Iterable<String> texte = new ArrayList<>();
		for (String each : texte) {
			System.out.println(each);
		}
	}

	
	private class Currywurst {
		
		public Currywurst(Fleisch fleisch, Flüssiges soße) {
			
		}
	}
	
	private class Wurst implements Fleisch {
		
	}
	
	private class Currysoße implements Flüssiges {
		
	}
	
	private interface Fleisch {
		
	}
	
	private interface Flüssiges {
		
	}
	
}

