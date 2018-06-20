package com.creational.factoryDP.ElectricPlanDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElectricBill {

	public static void main(String[] args) throws IOException {

		ElectricPlanFactory electricPlanFactory = new ElectricPlanFactory();

		System.out.print("Enter the name of plan for which the bill will be generated: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String planName = br.readLine();

		System.out.print("Enter the number of units for bill will be calculated: ");
		int units = Integer.parseInt(br.readLine());

		System.out.print("Bill amount for " + planName + " plan of  " + units + " units is: ");

		ElectricPlan electricPlan = electricPlanFactory.getElectricPlan(planName);
		electricPlan.getElectricRate();
		electricPlan.calculateElectricBill(units);

	}

}
