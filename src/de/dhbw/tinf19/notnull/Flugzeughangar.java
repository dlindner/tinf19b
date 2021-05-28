package de.dhbw.tinf19.notnull;

import java.util.Optional;

public interface Flugzeughangar {

	Flugzeug fahreRaus1(String name);
	
	// Railway-Oriented Programming
	Flugzeug fahreRaus2(String name) throws KeinFlugzeugDa;
	
	Optional<Flugzeug> fahreRaus3(String name);
	
	// Railway-Oriented Programming
	Optional<Flugzeug> fahreRaus4(String name) throws TechnischesProblem;
}
