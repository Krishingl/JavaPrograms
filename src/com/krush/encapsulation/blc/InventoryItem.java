package com.krush.encapsulation.blc;
//BLC class
public class InventoryItem 
{
	private String itemName;
	private double pricePerUnit;
	private int qualityInStock;
	
	
	public InventoryItem(String itemName, double pricePerUnit, int qualityInStock) {
		super();
		this.itemName = itemName;
		this.pricePerUnit = pricePerUnit;
		this.qualityInStock = qualityInStock;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public double getPricePerUnit() {
		return pricePerUnit;
	}


	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}


	public int getQualityInStock() {
		return qualityInStock;
	}


	public void setQualityInStock(int qualityInStock) {
		this.qualityInStock = qualityInStock;
	}
	
	public double calculateTotalValue(double pricePerUnit , int qualityInStock) 
	{
		
		return this.pricePerUnit * this.qualityInStock;
		
	}


	@Override
	public String toString() {
		return "InventoryItem [itemName=" + itemName + ", pricePerUnit=" + pricePerUnit + ", qualityInStock="
				+ qualityInStock + "]";
	}
	
	
	
	
	

}
