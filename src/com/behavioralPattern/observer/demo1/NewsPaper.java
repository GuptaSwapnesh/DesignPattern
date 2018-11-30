/**
 * 
 */
package com.behavioralPattern.observer.demo1;

/**
 * @author SwapneshGupta
 *
 */
public class NewsPaper implements Observer {

	/*
	 * Notifies the NewsPaper Observer
	 */
	@Override
	public void update(float interest) {
		System.out.println("Newspaper: Interest Rate updated, new Rate is: " + interest);
	}

}
