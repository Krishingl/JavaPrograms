package com.krush.encapsulation.elc;
import com.krush.encapsulation.blc.*;
import java.util.Scanner;

public class InventoryMain
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Item Name: ");
		String iName=sc.nextLine();
		System.out.print("Enter Item Price: ");
		double iPrice=sc.nextDouble();
		System.out.print("Enter Item Quatity: ");
		int iQuantity=sc.nextInt();
		
		
		InventoryItem item=new InventoryItem(iName, iPrice, iQuantity);
		
		System.out.println(""+item+'\n'+'\n'+"Your total Bill is "+item.calculateTotalValue(iPrice, iQuantity)+'\n');
		
		System.out.println("------------------------------------------------------------"+'\n'+'\n');
		System.out.println("Any updation in Stock Price OR Quantity : ");
		
		char updation=sc.next().charAt(0);
		
		if(updation=='y'||updation=='Y')
		{
			
			System.out.print("Enter New Price Per Unit :");
			iPrice= sc.nextDouble();
			item.setPricePerUnit(iPrice);
			System.out.print("Enter New Quantity In Stock: ");
			iQuantity = sc.nextInt();
			item.setQualityInStock(iQuantity);

			System.out.println(""+item+'\n'+"Your total Bill is "+item.calculateTotalValue(iPrice,iQuantity )+'\n');
		}else {
			System.out.println("Thanks You for visting...! ");
		}
		
		
		
		
		
		
		sc.close();
		
		
	}

}
