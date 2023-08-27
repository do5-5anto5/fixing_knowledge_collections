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
		if (!itemsListIsEmpty()) {
			for (Item item : itemsList) {
				if (item.getName().equalsIgnoreCase(name)) {
					itemsToRemove.add(item);
				}
			}
		} else {
			System.out.println("Empty cart.");
		}
		itemsList.removeAll(itemsToRemove);
	}

	public void getTotal() {
		double total = 0;
		if (!itemsListIsEmpty()) {
			for (Item item : itemsList) {
				total += (item.getPrice() + item.getQuantity());
			}
		} else {
			throw new RuntimeException("Empty List.");
		}
		System.out.println("\n Total amount: " + String.format("%.2f", total));
	}

	public void showItems() {
		if (!itemsListIsEmpty()) {
			for (Item item: itemsList) {
				System.out.println(item);
			}
		} else {
			throw new RuntimeException ("Empty List.");
		}
	}
	
	public boolean itemsListIsEmpty() {
		return itemsList.isEmpty();
	}
}
