package com.suresh.iterator.example1;

import java.util.ArrayList;
import java.util.List;

/*
 * PancakeHouse implementation of Menu Item.
 * Pancake House Menu implementation using ArrayList to store menu items.
 */

public class PancakeHouseMenu {

    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem("k&B's Pancake Breakfast", "Pancakes with scrabled eggs and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs and sausage", false, 2.99);
        addItem("Blueberry Pancakes ", "Pancakes made with fresh blueberries", true, 2.99);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
