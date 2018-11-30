/**
 * 
 */
package com.behavioralPattern.observer.demo1;

/**
 * @author SwapneshGupta
 *
 */
public class Internet implements Observer {

	/*
	 * Notifies the Internet Observer
	 */
	@Override
	public void update(float interest) {
		System.out.println("Internet: Interest Rate updated, new Rate is: " + interest);

	}

}
