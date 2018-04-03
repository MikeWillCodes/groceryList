package com.company;

import java.time.LocalDate;

public class GroceryItem {

    private LocalDate date;
    private String item;
    private Integer price;

    public GroceryItem(){

        date = LocalDate.now();
        item = "bread";
        price = 5;
    }

    public GroceryItem(LocalDate date, String item, Integer price) {
        this.date = date;
        this.item = item;
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "GroceryItem: " + date + " | " + item + " | " + " | " + price;
    }
}
