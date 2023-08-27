package services;

import java.util.ArrayList;
import java.util.List;

import entities.Item;

public class ItemService {

	private List<Item> itemsList;

	public ItemService() {
		this.itemsList = new ArrayList<>();
	}
	
	public void addItem(String name, double price, int quantity) {
		itemsList.add(new Item(name, price, quantity));
	}
	
	public void removeItem(String name) {
		List<Item> itemsToRemove = new ArrayList<>();
		for (Item item : itemsList) {
			if (item.getName().equalsIgnoreCase(name)) {
				itemsToRemove.add(item);
			}
			
		}
		itemsList.removeAll(itemsToRemove);
	}
	
	public double getTotal() {
		double total = 0;
		for (Item item : itemsList) {
			total += (item.getPrice() + item.getQuantity());
		}
		return total;
	}
	
	public void showItems() {
		System.out.println(itemsList);
	}
}
