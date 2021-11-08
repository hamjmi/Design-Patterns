package com.hamid.designPatterns.builder;


import java.util.ArrayList;
import java.util.List;

public class OrderItems {
    List<Item> items = new ArrayList<Item>();
    public void addItems(Item item)
    {
        items.add(item);
    }
    public float getPrice()
    {
        float price=0.0f;
        for(Item item : items)
        {
            price+=item.price();
        }
        return price;
    }

    public void print()
    {
        for(Item item : items)
        {
            System.out.println(item.name() + " : " + item.price());
        }
    }
}
