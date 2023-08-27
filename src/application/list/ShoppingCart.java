package application.list;

import java.util.Scanner;

import services.ItemService;

public class ShoppingCart {
	public static void main (String[] args) {
	
		
		ItemService itemService = new ItemService();
		
		try (Scanner scan = new Scanner(System.in)){
		addItemProcess(itemService, scan);
		removeItemProcess(itemService, scan);
		itemService.showItems();
		scan.next();
		itemService.getTotal();
		}
		catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	
	public static void addItemProcess(ItemService itemService, Scanner scan) {
		System.out.print("How many items to add in Cart? ");
		int insertItems = scan.nextInt();
		for (int i=0; i<insertItems; i++) {
			System.out.print("\nInsert product number " + (i+1) + " name: ");
			String name = scan.next();
			System.out.print("Insert product " + (i+1) + " price: ");
			double price = scan.nextDouble();
			System.out.print("Insert product " + (i+1) + " quantity: ");
			int quantity = scan.nextInt();
			
			itemService.addItem(name, price, quantity);
		}
	}
	
	public static void removeItemProcess(ItemService itemService, Scanner scan) {
		String answer = "y";
		while (validateRemove(answer)) {
			System.out.println("\nRemove any item from cart? ");
			answer = scan.next();
			if (validateRemove(answer)) {
			System.out.print("\nInsert the name of product to remove from cart: ");		
			String name = scan.next();
			itemService.removeItem(name);
			}
		}		
	}
	
	public static boolean validateRemove(String answer) {
		return answer.equals( "y" )|| answer == "Y" || answer.equals( "yes") || answer.equals( "Yes") || answer.equals( "Yes");
	}
}
