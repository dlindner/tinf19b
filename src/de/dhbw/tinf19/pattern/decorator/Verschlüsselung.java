package de.dhbw.tinf19.pattern.decorator;

import java.util.Collections;
import java.util.List;

import org.assertj.core.util.Arrays;

public class Verschlüsselung extends Dekorierer {
	
	public Verschlüsselung(
			Übertragungsstrecke nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void übertrage(String nachricht) {
		super.übertrage(
				verschlüsselte(
				nachricht));
	}
	
	private String verschlüsselte(String text) {
		List<Object> list = Arrays.asList(
				text.toCharArray());
		Collections.shuffle(list);
		StringBuilder result = new StringBuilder();
		list.forEach(result::append);
		return result.toString();
	}
}
