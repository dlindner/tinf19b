package de.dhbw.tinf19.notnull;

import java.util.Optional;
import java.util.Random;

public class LeererHangar implements Flugzeughangar {
	
	public LeererHangar() {
		super();
	}
	
	@Override
	public Flugzeug fahreRaus1(String name) {
		return null;
	}
	
	@Override
	public Flugzeug fahreRaus2(String name) throws KeinFlugzeugDa {
		throw new KeinFlugzeugDa();
	}
	
	@Override
	public Optional<Flugzeug> fahreRaus3(String name) {
		return Optional.empty();
	}
	
	@Override
	public Optional<Flugzeug> fahreRaus4(String name) throws TechnischesProblem {
		if (new Random().nextBoolean()) {
			throw new TechnischesProblem();
		}
		return Optional.empty();
	}
}
