package com.krush.inheritance.blc;

public class Hosteller extends Student{

	protected double hostelFee;

	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}

	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}

	public double payFee(double amount) {
		double totalFee = this.examFee + this.hostelFee;
		
			return totalFee - amount;
	}


	
	
	
}
