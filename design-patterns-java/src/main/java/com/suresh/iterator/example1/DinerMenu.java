package com.suresh.iterator.example1;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", true, 3.29);
        addItem("Hotdog", "A hot dog, with sauerkraut,relish,onions, topped with cheese ", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add items to menu");

        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;

        }

    }

    /*
     * It creates a DinerMenuIterator from the menuItems array and return to the
     * client.
     * We are returning the Iterator interface. The client doesn't need to know how
     * the MenuItems are maintained in the DinerMenu,
     * nor does it need to know how the DinerMenuIterator is implemented. It just
     * need to use the iterator to step through the items in the menu.
     */
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
