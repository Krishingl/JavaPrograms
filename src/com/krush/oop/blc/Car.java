package com.krush.oop.blc;
//Business Logic Class
public class Car {
	  //Car Properties
	   String carCompany;
	   String carModelName;
	   String carColor;
	   int carGareCount;
	   boolean withAirBags;
	   boolean itsSport;
	   boolean sunRoffAvailable;
	   int fuleTankCapacity;
       double carPrice;
	   
	   
	   //Car behaviour(methods)
	   
	   public void setCarData(String cCompany , String cModelName , String cColor , int cGareCount , boolean wAirBags , boolean iSport ,boolean sRoffAvailable,  int fTankCapacity,double carPrice)
	   {
		  carCompany= cCompany;
		  carModelName=cModelName;
		  carColor=cColor;
		  carGareCount=cGareCount;
		  withAirBags=wAirBags;
		  itsSport=iSport;
		  sunRoffAvailable=sRoffAvailable;
		  fuleTankCapacity=fTankCapacity;
		  
		  this.carPrice=carPrice;
		  
	   }


	@Override
	public String toString() {
		return "Car [carCompany=" + carCompany + ", carModelName=" + carModelName + ", carColor=" + carColor
				+ ", carGareCount=" + carGareCount + ", withAirBags=" + withAirBags + ", itsSport=" + itsSport
				+ ", sunRoffAvailable=" + sunRoffAvailable + ", fuleTankCapacity=" + fuleTankCapacity+"L" + ", CarPrice "+carPrice+".Rs"+ "]";
	}
        
	
	public void itsStart() {
		   System.out.println(carCompany+" "+carModelName+" its are Started..!");
	}
	   
	public void itsStop() {
		System.out.println(carCompany+" "+carModelName+" its are Stoped..!");
	}
	public void openLock() {
		System.out.println(carCompany+" "+carModelName+" its are UnLock..!");
	}
	public void itsLock() {
		System.out.println(carCompany+" "+carModelName+" its are Lock..!");
	}
	
	
	
	
	
	

}
