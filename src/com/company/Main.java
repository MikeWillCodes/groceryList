package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        // 3 grocery item objects
        GroceryItem apple = new GroceryItem();
        GroceryItem milk = new GroceryItem();
        GroceryItem cereal = new GroceryItem();

        //array of items
        System.out.println(groceryArray(apple,milk,cereal));
    }

    // store the 3 items in an arraylist
    public static ArrayList<GroceryItem> groceryArray(GroceryItem a, GroceryItem b, GroceryItem c) {
        ArrayList<GroceryItem> items = new ArrayList<>();
        items.add(a);
        items.add(b);
        items.add(c);
        return items;
    }
}
