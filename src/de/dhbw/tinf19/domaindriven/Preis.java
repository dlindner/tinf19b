package de.dhbw.tinf19.domaindriven;

import java.util.Objects;

public class Preis {

	private final long euro;

	public Preis(int euro) {
		super();
		this.euro = euro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(euro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Preis other = (Preis) obj;
		return euro == other.euro;
	}
}
