package com.Dinesh;

import java.util.ArrayList;
import java.util.List;

public class Menu{

    private List<Combos> combos;

    private List<Items> items;


    public Menu() {

        this.combos=new ArrayList<>();
        this.items=new ArrayList<>();

    }

    public boolean add_item(Items item){

        if(item_exists(item.getName())<1){
            this.items.add(item);
            return true;
        }

        return false;
    }

    public int item_exists(String item){

        for (Items cur_item:
             this.items) {
            if(cur_item.getName().equalsIgnoreCase(item)){
                return  1;
            }
        }

        return -1;

    }

    public boolean add_combo(Combos combos){

        if(combo_exists(combos.getName())<1){
            this.combos.add(combos);
            return true;
        }
        return false;
    }

    public int combo_exists(String item){

        for (Combos cur_combo:
                this.combos) {
            if(cur_combo.getName().equalsIgnoreCase(item)){
                return  1;
            }
        }

        return -1;

    }


}