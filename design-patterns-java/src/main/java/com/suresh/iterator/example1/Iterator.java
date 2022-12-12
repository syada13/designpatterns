package com.suresh.iterator.example1;

/*
 * Custom interface used which PancakeHouseMenuIterator and DinerMenuIterator concrete classes will implement
 * to iterate through any kind of  collection of objects : arrays, list, hash maps...
 */

public interface Iterator {

    public boolean hasNext();

    public MenuItem next();

}
