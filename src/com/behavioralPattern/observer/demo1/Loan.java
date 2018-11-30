/**
 * 
 */
package com.behavioralPattern.observer.demo1;

import java.util.ArrayList;

/**
 * @author SwapneshGupta
 *
 */
public class Loan implements Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();

	private String loanType;
	private float interestRate;
	private String bankName;

	public Loan(String loan, float interest, String bank) {
		this.loanType = loan;
		this.interestRate = interest;
		this.bankName = bank;
	}

	public float getInterest() {
		return interestRate;
	}

	public void setInterest(float interest) {
		this.interestRate = interest;
		notifyObserver();
	}

	public String getBank() {
		return this.bankName;
	}

	public String getType() {
		return this.loanType;
	}

	/*
	 * Adds/ Registers the Observers from the list
	 */
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	/*
	 * Removes the Observers from the list
	 */
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	/*
	 * Notifies the Observers
	 */
	@Override
	public void notifyObserver() {
		System.out.println("Notifying Observers on change in " + loanType + " interest rate @" + bankName);
		for (Observer observer : observers) {
			observer.update(this.interestRate);
		}
	}

}
