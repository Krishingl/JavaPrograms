package com.krush.opp_programs.blc;

public class Book {
	
	private String  title;
	private String author;
	private double price;
	
	
	public Book(String title, String author, double price) 
	{
		super();
		if(price <0) {
			System.err.println("Its Not Valid Creating Book with Negative Price.");
			this.title ="No Title";
			this.author = "No Author";
			this.price = price;
			
			
		}else {
		
		this.title = title;
		this.author = author;
		this.price = price;
		}
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	
public void	applyDiscount(double discountPercentage)
{
         if(discountPercentage<0)	{
        	 System.out.println("Invalid discount percentage.");
        	 System.exit(0);
         }
         
         
        price= price-(discountPercentage*price/100);
         
}

	
	
	
	
	
}
