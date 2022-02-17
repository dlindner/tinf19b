package de.dhbw.tinf19.tests;

import static org.assertj.core.api.Assertions.assertThat;
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
		assertThat(actual).isFalse();
	}
	
	@Test
	public void fürNichtweihnachten() {
		// Arrange		
		final LocalDateTime notxmas = LocalDateTime.of(2022, 12, 14, 0, 0);
		
		// Act
		final boolean actual = IstValentinstag.am(notxmas);
		
		// Assert
		assertThat(actual).isFalse();
	}

	@Test
	public void fürDenValentinstag() {
		// Arrange		
		final LocalDateTime derValentinstag = LocalDateTime.of(2022, 2, 14, 11, 38);
		
		// Act
		final boolean actual = IstValentinstag.am(derValentinstag);
		
		// Assert
		assertThat(actual).isTrue();
	}
}
