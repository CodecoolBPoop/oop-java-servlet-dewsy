package com.codecool.servlet;


import java.util.ArrayList;
import java.util.List;

public class ItemStore {

    private List<Item> itemList = new ArrayList<>();

    public Item add(String name, double price) {
        Item newItem = new Item(itemList.size(), name, price);
        itemList.add(newItem);
        return newItem;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void remove(int id) {
        for (Item item : itemList) {
           if (item.getId() == id) {
               itemList.remove(item);
               break;
           }
        }
    }

    public ItemStore(){
        this.add("laptop", 16.6);
        this.add("phone", 10.6);
        this.add("tablet", 20.6);
    }


    }
