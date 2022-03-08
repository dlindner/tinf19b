package de.dhbw.tinf19.pattern.singleton;

import java.util.Collections;

public final class UserRepository {

	private static final Object lock = new Object();
	private static UserRepository instance = null;
	
	private UserRepository() {
		super();
	}
	
	// LAZY Initialization Singleton (ALAP)
	public static UserRepository getInstance() {
		synchronized (lock) {
			if (null == instance) {
				instance = new UserRepository();
			}
			return instance;
		}
	}
	
	public Iterable<User> allUsers() {
		return Collections.emptyList();
	}
}
