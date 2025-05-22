package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private final int maxSize;
    private final List<T> items;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        if (items.size() < maxSize) {
            items.add(item);
        } else {
            System.out.println("Cannot add more items. Max size of " + maxSize + " reached.");
        }
    }

    public List<T> getItems() {
        return items;
    }
}
