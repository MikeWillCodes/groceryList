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
        GroceryItem d = new GroceryItem(LocalDate.of(2018,1,9),"milk",4);


        // Output array of GroceryItem objects
        ArrayList<GroceryItem> items = groceryArray(a,b,c,d);
        System.out.println("The grocery list and dates " + groceryArray(a,b,c,d));

        //Output the count of purchased items
        System.out.println("The number of purchased items on last day " + purchasedItemsOnLastVisit(items));

        // Output the total price of date [D]
        System.out.println("The total price of date [D] items: $" + totalPriceofItemsPurchased(items));

        // Output how many of the same items have been purchased
        System.out.println("Number of the purchased item: " + howManyTimesItemWasPurchased(items,"milk"));
    }

    // How many of item [X] has been purchased?
    public static int howManyTimesItemWasPurchased(ArrayList<GroceryItem> items, String itemCheck){
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItem() == itemCheck){
                  count = count + 1;
            }
        }
        return count;
    }


    // Total price of items purchased on date [D]
    public static int totalPriceofItemsPurchased(ArrayList<GroceryItem> items){
        int price = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getDate().isEqual(LocalDate.now())){
                price = price + items.get(i).getPrice();
            }
        }
        return price;
    }


    // Count the number of purchased items on last visit
    public static int purchasedItemsOnLastVisit(ArrayList<GroceryItem> items){
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getDate().isAfter(LocalDate.now().minusDays(1))){
                count = count + 1;
            }
        }
        return count;
    }

    // Store the GroceryItem objects in an arraylist
    public static ArrayList<GroceryItem> groceryArray(GroceryItem a, GroceryItem b, GroceryItem c, GroceryItem d) {
        ArrayList<GroceryItem> items = new ArrayList<>();
        items.add(a);
        items.add(b);
        items.add(c);
        items.add(d);

        return items;
    }
}
