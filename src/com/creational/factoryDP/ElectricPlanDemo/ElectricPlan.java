package com.creational.factoryDP.ElectricPlanDemo;

public abstract class ElectricPlan {

	protected double rate;

	abstract void getElectricRate();

	public void calculateElectricBill(int unitsConsumed) {
		System.out.println(unitsConsumed * rate);
	}

}
