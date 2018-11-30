/**
 * 
 */
package com.behavioralPattern.observer.demo1;

/**
 * @author SwapneshGupta
 *
 */
public class ObserverTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		NewsPaper printMedia = new NewsPaper();
		Internet onlineMedia = new Internet();

		Loan personalLoan = new Loan("Personal Loan", 12.5f, "Standard Charterd");
		personalLoan.registerObserver(printMedia);
		personalLoan.registerObserver(onlineMedia);
		personalLoan.setInterest(3.5f);

	}

}
