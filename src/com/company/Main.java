package com.company;


import java.util.ArrayList;
import java.util.Objects;

import static java.time.LocalDate.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, User!");

        // Create 3 GroceryItem objects
        GroceryItem a = new GroceryItem(now(), "milk", 3);
        GroceryItem b = new GroceryItem(of(2018,2,12), "peanut butter",4);
        GroceryItem c = new GroceryItem(of(2018,1,6),"grape jelly",4);
        GroceryItem d = new GroceryItem(of(2018,1,9),"milk",4);
        GroceryItem e = new GroceryItem(of(2018,1,12),"Plastic Utensils",11);


        // Output array of GroceryItem objects
        ArrayList<GroceryItem> items = groceryArray(a,b,c,d,e);
        System.out.println("The grocery list and dates " + groceryArray(a,b,c,d,e));

        //Output the count of purchased items
        System.out.println("The number of purchased items on last day " + purchasedItemsOnLastVisit(items));

        // Output the total price of date [D]
        System.out.println("The total price of date [D] items: $" + totalPriceofItemsPurchased(items));

        // Output how many of the same items have been purchased
        System.out.println("Number of the purchased item: " + howManyTimesItemWasPurchased(items,"milk"));

        // Output items that cost more than $10
        System.out.println("Items that cost more that $10: " + itemsThatCostMoreThanTenDollas(items,10));
    }


    // What items cost MORE than $10
    private static int itemsThatCostMoreThanTenDollas(ArrayList<GroceryItem> items, int price){
        int count = 0;
        for ( GroceryItem item: items) {
            if (item.getPrice() > price){
                count = count + 1;
            }
        }
        return count;
    }

    // How many of item [X] has been purchased?
    private static int howManyTimesItemWasPurchased(ArrayList<GroceryItem> items, String itemCheck){
        int count = 0;
        for (GroceryItem item : items) {
            if (Objects.equals(item.getItem(), itemCheck)) {
                count = count + 1;
            }
        }
        return count;
    }


    // Total price of items purchased on date [D]
    private static int totalPriceofItemsPurchased(ArrayList<GroceryItem> items){
        int price = 0;
        for (GroceryItem item : items) {
            if (item.getDate().isEqual(now())) {
                price = price + item.getPrice();
            }
        }
        return price;
    }


    // Count the number of purchased items on last visit
    private static int purchasedItemsOnLastVisit(ArrayList<GroceryItem> items){
        int count = 0;
        for (GroceryItem item : items) {
            if (item.getDate().isAfter(now().minusDays(1))) {
                count = count + 1;
            }
        }
        return count;
    }

    // Store the GroceryItem objects in an array list
    private static ArrayList<GroceryItem> groceryArray(GroceryItem a, GroceryItem b, GroceryItem c, GroceryItem d, GroceryItem e) {
        ArrayList<GroceryItem> items = new ArrayList<>();
        items.add(a);
        items.add(b);
        items.add(c);
        items.add(d);
        items.add(e);

        return items;
    }
}
