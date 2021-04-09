package de.dhbw.tinf19.intro;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		final Tesla tesla = new Tesla();
		final Mustang mustang = new Mustang();
		tesla.fahre();
		mustang.fahre();
		
		final Iterable<Auto> fuhrpark = Arrays.asList(
				tesla,
				mustang);
		fuhrpark.forEach(Auto::fahre);

		final Flughafenparkplatz parkplatz = new Flughafenparkplatz();
		parkplatz.parke(tesla);
		parkplatz.parke(mustang);
		fuhrpark.forEach(parkplatz::parke);
	}
}
