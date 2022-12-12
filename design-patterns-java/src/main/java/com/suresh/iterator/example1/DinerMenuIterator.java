package com.suresh.iterator.example1;

/*
 * Add an iterator to iterate through MenuItems.
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;

    }

    /*
     * Check to see if we've seen all elements of the provided array,
     * and return true if there are more to iterate through
     */

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;

        } else {
            return true;
        }

    }

    /*
     * The next() method return the next item in the array
     * and increments the position.
     */
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;

    }

}
