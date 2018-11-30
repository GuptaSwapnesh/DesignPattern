/**
 * 
 */
package com.behavioralPattern.observer.demo1;

/**
 * @author SwapneshGupta
 *
 */
public interface Subject {

	public void registerObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObserver();

}
