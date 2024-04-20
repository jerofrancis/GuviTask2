package task2;

import java.util.Scanner;

public class XYZ {
	
	public static double calculateTotal(Product[] products) {
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            total += products[i].price * products[i].quantity;
        }
        return total;
    }


	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Product[] product = new Product[5]; 
		Scanner sc=new Scanner(System.in);  
		
		for(int i=0; i<5; i++)  
		{  
		System.out.print("Enter pid "+(i+1)+":");  
		int pid =sc.nextInt();  
		 
		System.out.print("Enter price "+(i+1)+":");  	 
		int price=sc.nextInt();  
		
		System.out.print("Enter quantity "+(i+1)+":");  
		int qty=sc.nextInt(); 
		
		product[i] = new Product(pid,price,qty);
		} 
		
		 double highestPrice = Double.MIN_VALUE;
	        int productid = 0;
	        for (int i = 0; i < 5; i++) {
	            if (product[i].price > highestPrice) {
	                highestPrice = product[i].price;
	                productid = product[i].pid;
	            }
	        }

	        System.out.println("\nProductID with highest price:");
	        System.out.println("Product Id: " + productid);
	        System.out.println("Price: " + highestPrice);
	        
	        double totalAmount = calculateTotal(product);

	        System.out.println("\nTotal amount spent on all products:" + totalAmount);
		
	}

}
