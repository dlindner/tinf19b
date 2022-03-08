package de.dhbw.tinf19.pattern.singleton;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public enum ValidUserRepository {

	instance(List.of("1", "3", "2")),
//	instance2("2"),
//	instance3("3"),
	;
	
	private final List<String> id;
	
	private ValidUserRepository(List<String> ids) {
		this.id = ids;
	}
	
	public Iterable<User> allUsers() {
		return Collections.emptyList();
	}
}
