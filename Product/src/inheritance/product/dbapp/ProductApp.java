package inheritance.product.dbapp;

import java.util.Scanner;

public class ProductApp {

	public static void main(String[] args) {
	
		System.out.println("Welcome to the Product Viewwer");
		System.out.println();
	
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Enter the Product Code:");
			String productCode = sc.nextLine();
			
			Product p = ProductDB.getProduct(productCode);
			System.out.println();
			
			if(p!=null) {
				System.out.println("Description :" + p.toString());
				System.out.println("Price :" + p.getPriceFormatted());
			}else {
				System.out.println("no mathc");
			}
			System.out.println();
			System.out.println("prdocut count " + Product.getCount());
			
			System.out.println();
			System.out.println("continue? (y/n)");
			
			choice = sc.nextLine();
			System.out.println();
			
		}
	sc.close();

	}

}
