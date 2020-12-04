package com.Dinesh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Combos {

    private String name;

    private List<Items> items;

    public Combos(String name) {
        this.name=name;
        this.items=new ArrayList<>();
    }

    public boolean addcombo(String name,Items items){

            this.items.add(items);

            return false;

    }

    public String getName() {
        return name;
    }

    public List<Items> getItems() {
        return items;
    }
}
