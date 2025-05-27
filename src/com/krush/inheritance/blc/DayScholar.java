package com.krush.inheritance.blc;

public class DayScholar extends Student {
	protected double transportFee;

	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;

	}

	@Override
	public String toString() {

		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}

	public double payFee(double amount) {
		double totalFee = this.examFee + this.transportFee;
		if (totalFee < amount) {
			return totalFee - amount;
		} else
			return totalFee - amount;
	}

}
/*
if(payFee(amount)>0) {
	System.out.print("Payable Amount is :"+payFee(amount));
}else {
	System.out.print("Refundabale Amount is :"+payFee(amount));
}

*/



