package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, User!");

        // Create 3 GroceryItem objects
        GroceryItem a = new GroceryItem(LocalDate.now(), "milk", 3);
        GroceryItem b = new GroceryItem(LocalDate.of(2018,2,12), "peanut butter",4);
        GroceryItem c = new GroceryItem(LocalDate.of(2018,1,6),"grape jelly",4);


        // Output array of GroceryItem objects
        ArrayList<GroceryItem> items = groceryArray(a,b,c);
        System.out.println("The grocery list and dates " + groceryArray(a,b,c));

        //Output the count of purchased items
        System.out.println("The number of purchased items on last day " + purchasedItems(items));
    }



    // Count the number of purchased items on last visit
    public static int purchasedItems(ArrayList<GroceryItem> items){
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getDate().isAfter(LocalDate.now().minusDays(1))){
                count = count + 1;
            }
        }
        return count;
    }

    // Store the GroceryItem objects in an arraylist
    public static ArrayList<GroceryItem> groceryArray(GroceryItem a, GroceryItem b, GroceryItem c) {
        ArrayList<GroceryItem> items = new ArrayList<>();
        items.add(a);
        items.add(b);
        items.add(c);

        return items;
    }
}
