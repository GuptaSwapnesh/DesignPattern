package com.creational.singletonDP.LazyORNonThreadSafeDemo;

public class LazyInitialization {

	private static LazyInitialization lazyInitialization;

	private LazyInitialization() {
		// TODO Auto-generated constructor stub
	}

	public static LazyInitialization getInstance() {
		if (lazyInitialization == null) {
			lazyInitialization = new LazyInitialization();
			System.out.println("Lazy Initialized");
		}

		return lazyInitialization;
	}

}
