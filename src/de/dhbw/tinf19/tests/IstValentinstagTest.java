package de.dhbw.tinf19.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.function.Supplier;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import de.dhbw.tinf19.tests.IstValentinstag.Zeitgeber;

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
	
	@Test
	public void fürHeuteAmValentinstag() {
		// Arrange
		final Zeitgeber valentinstag = Mockito.mock(Zeitgeber.class);
		Mockito.when(valentinstag.jetzt()).thenReturn(
				LocalDateTime.of(2022, 2, 14, 11, 38));
		
		// Act & Assert
		assertThat(
			new IstValentinstag(valentinstag).heute()
		).isTrue();
		
		// Verify
		Mockito.verify(valentinstag, Mockito.times(1)).jetzt();
	}
	
	@Test
	public void fürHeuteNichtAmValentinstag() {
		// Arrange
		final Zeitgeber nichtValentinstag = () -> LocalDateTime.of(2022, 2, 22, 22, 22);

		assertThat(
			new IstValentinstag(nichtValentinstag).heute()
		).isFalse();
	}

}
