package com.creational.singletonDP.LazyORNonThreadSafeDemo;

public class LazyInitializationDemo {

	public static void main(String[] args) {

		LazyInitialization initialization = LazyInitialization.getInstance();
		LazyInitialization initialization2 = LazyInitialization.getInstance();

		if (initialization == initialization2) {
			System.out.println("Lazy 1 :- " + initialization.hashCode());
			System.out.println("Lazy 2 :- " + initialization2.hashCode());
			System.out.println("Same & Single Object");
		} else {
			System.out.println("Singleton not implemented!!!");
		}
	}

}
