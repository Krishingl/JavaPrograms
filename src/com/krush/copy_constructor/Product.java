package com.krush.copy_constructor;

public class Product
{
	private int productId;
	private String productName;
	
	
	
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	public Product(Product prod)// prod=p1
	{
		
		this.productId = prod.productId;
		this.productName = prod.productName;
	}





	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	
	
	public class copyConstructorDemo1{
		public static void main(String[] args)
		{
			Product p1 = new Product(456,"Laptop");
			System.out.println("Orignal Data : "+p1);
			
			Product p2 = new Product(p1);
			System.out.println("Copied Data : "+p2);
		}
		    
	}
	

}
