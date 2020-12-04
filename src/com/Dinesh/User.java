package com.Dinesh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User<T extends Items,Combos> {

    private String name;

    private HashMap<Integer,T> cart;

    public User(String name) {
        this.name = name;
        this.cart=new HashMap<>();
    }

    public boolean add_item(T item,int quantity){
        this.cart.put(quantity,item);
        return true;
    }

    public String getName() {
        return name;
    }

    public HashMap<Integer, T> getCart() {
        return cart;
    }
}
