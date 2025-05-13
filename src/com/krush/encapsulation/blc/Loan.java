package com.krush.encapsulation.blc;

public class Loan {
	private double principle;
	private double interesteRate;
	private int durationMonths;
	
	
	
	public Loan(double principle, double interesteRate, int durationMonths) {
		if(principle<=0 || interesteRate<=0||durationMonths<=0)
		{
			System.err.println("Error");
			System.exit(0);
		}
		this.principle = principle;
		this.interesteRate = interesteRate;
		this.durationMonths = durationMonths;
	}



	public double getPrinciple() {
		return principle;
	}



	public void setPrinciple(double principle) {
		this.principle = principle;
	}



	public double getInteresteRate() {
		return interesteRate;
	}



	public void setInteresteRate(double interesteRate) {
		this.interesteRate = interesteRate;
	}



	public int getDurationMonths() {
		return durationMonths;
	}



	public void setDurationMonths(int durationMonths) {
		this.durationMonths = durationMonths;
	}



	


}
