package com.smartwarehousesystem;

import java.util.ArrayList;
import java.util.List;

// Generic class of Type T  extends Warehouse Class
public class Storage<T extends WarehouseItem>{

    // Private instances
    private final List<T> items;

    // Constructor
    public Storage(){
        items = new ArrayList<>();
    }

    //Add Items
    public void addItem(T item){
        items.add(item);
    }

    // Return items
    public List<? extends WarehouseItem> getAllItems(){
        return items;
    }

    // Append everything to String builder
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (WarehouseItem item : items){
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }
}