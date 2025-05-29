package com.krush.inheritance_hierarchical.blc;

public class StudentTicket extends Ticket {
	private boolean studentDiscount;
	
	
	public boolean isStudentDiscount() {
		return studentDiscount;
	}
	
	public void setStudentDiscount(boolean studentDiscount) {
		this.studentDiscount = studentDiscount;
	}

	public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount) {
		super(eventName, seatNumber, price);
		this.studentDiscount = studentDiscount;
	}

	
	
	
}
