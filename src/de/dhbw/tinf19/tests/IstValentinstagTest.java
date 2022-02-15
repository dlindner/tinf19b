package de.dhbw.tinf19.tests;

import static org.junit.Assert.assertFalse;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

public class IstValentinstagTest {

	@Test
	public void fürMitteFebruar() {
		// Arrange		
		final LocalDateTime heute = LocalDateTime.of(2022, 2, 15, 11, 38);
		
		// Act
		final boolean actual = IstValentinstag.am(heute);
		
		// Assert
		assertFalse(actual);
	}
	
	@Test
	public void fürDenValentinstag() {
		// Arrange		
		final LocalDateTime derValentinstag = LocalDateTime.of(2022, 2, 14, 11, 38);
		
		// Act
		final boolean actual = IstValentinstag.am(derValentinstag);
		
		// Assert
		Assert.assertTrue(actual);
	}
}
