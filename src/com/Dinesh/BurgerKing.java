package com.Dinesh;


import java.util.List;

public class BurgerKing {

    private Menu menu;

    private List<User> users;


    public boolean adduser(User user){

        if(search_user(user)<1){
            this.users.add(user);
            return true;
        }

        return false;

    }

    private int search_user(User user){

        for (User current:
             this.users) {
            if(current.getName().equalsIgnoreCase(user.getName())){
                return 1;
            }
        }

        return -1;


    }


}
