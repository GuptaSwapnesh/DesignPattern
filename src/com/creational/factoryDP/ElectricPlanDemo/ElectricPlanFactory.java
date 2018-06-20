package com.creational.factoryDP.ElectricPlanDemo;

public class ElectricPlanFactory {

	private static final String INSTITUTIONALPLAN = "INSTITUTIONALPLAN";
	private static final String COMMERCIALPLAN = "COMMERCIALPLAN";
	private static final String DOMESTICPLAN = "DOMESTICPLAN";

	public ElectricPlan getElectricPlan(String planType) {

		if (planType == null) {
			return null;
		} else {
			return getPlanType(planType);
		}
	}

	private ElectricPlan getPlanType(String planType) {

		if (DOMESTICPLAN.equalsIgnoreCase(planType)) {
			return new DomesticElectricPlan();
		} else if (COMMERCIALPLAN.equalsIgnoreCase(planType)) {
			return new CommercialElectricPlan();
		} else if (INSTITUTIONALPLAN.equalsIgnoreCase(planType)) {
			return new InstitutionalElectricPlan();
		}
		return null;
	}

}
