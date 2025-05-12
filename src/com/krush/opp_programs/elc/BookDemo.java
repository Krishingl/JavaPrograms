package com.krush.opp_programs.elc;
import java.util.Scanner;

import com.krush.opp_programs.blc.Book;

public class BookDemo {



	public static void main(String[] args)
	{
		
		
		 Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Book Title");
		
		String bookTitle= sc.nextLine();
		System.out.print("Enter the AuthorName : ");
		String authorName=sc.nextLine();
		System.out.print("Enter the Book Price : ");
	    double price=sc.nextDouble();
		
		Book book=new Book(bookTitle, authorName,price); 
		//Object Creation and Non Static Fields Initialize with users values using parameterized constructor. 
		
		
		System.out.print("Enter the discount in percentage :");
        double discount=sc.nextDouble();//.parseDouble(sc.next()); //discount read to user
		book.applyDiscount(discount);
		
		System.out.println(book);
		sc.close();

	}
	

}
