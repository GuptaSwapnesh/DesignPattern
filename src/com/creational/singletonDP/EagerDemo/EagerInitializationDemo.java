package com.creational.singletonDP.EagerDemo;

public class EagerInitializationDemo {

	public static void main(String[] args) {

		EagerInitialization eager1 = EagerInitialization.getEagerInitialized();
		EagerInitialization eager2 = EagerInitialization.getEagerInitialized();

		if (eager1 == eager2) {
			System.out.println("Eager 1 :- " + eager1.hashCode());
			System.out.println("Eager 2 :- " + eager2.hashCode());
			System.out.println("Same & Single Object");
		} else {
			System.out.println("Singleton not implemented!!!");
		}
	}

}
