package com.Dinesh;

import java.util.ArrayList;
import java.util.List;

public class User<T extends Items,Combos> {

    private String name;

    private List<T> cart;

    public User(String name) {
        this.name = name;
        this.cart=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<T> getCart() {
        return cart;
    }
}
