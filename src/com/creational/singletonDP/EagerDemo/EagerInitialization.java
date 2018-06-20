package com.creational.singletonDP.EagerDemo;

public class EagerInitialization {

	// Private static variable of the same class that is the only instance of
	// the class. It is created at the time of class loading
	private static EagerInitialization eagerInitialization = new EagerInitialization();

	// Private constructor to restrict instantiation of the class from other
	// classes.
	private EagerInitialization() {
		// TODO Auto-generated constructor stub
	}

	// Public static method that returns the instance of the class, this is the
	// global access point for outer world to get the instance of the singleton
	// class.
	public static EagerInitialization getEagerInitialized() {
		return eagerInitialization;
	}

}
