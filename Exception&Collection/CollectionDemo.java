package com.prashant;

import java.util.*;

public class CollectionDemo {
    public static void arrayListExample(){
        ArrayList<String>  data = new ArrayList<String>();
        data.add("Rai");
        MyConsole.print("No of elements is " +data.size() );
        data.add("kumar");
        MyConsole.print("No of elements is " +data.size() );
        data.add("Singh");
        MyConsole.print("No of elements is " +data.size() );
        data.add("Jha");
        MyConsole.print("No of elements is " +data.size() );
        data.add("Ranjan");
        MyConsole.print("No of elements is " +data.size() );
        data.add(2,"Prashant");
        for (String str:data) {
            MyConsole.print(str);
        }
        data.remove(2);
        for (String str:data) {
            MyConsole.print(str);
        }
    }

    public static void setExample(){
        HashSet<String> basket = new HashSet<String>();
        basket.add("apple");
        basket.add("guava");
        basket.add("pinapple");
        basket.add("banana");
        basket.add("apple");
        basket.add("guava");
        for(String s : basket) {
            MyConsole.print(s);
        }
    }

    public static void mapExample(){
        Map<String,String> users = new HashMap<String, String>();
        try{
            users.put("viresh","welcome123");
            users.put("prashant","home123");
            users.put("Rayan","come123");
            users.put("anirudh","welcome123");
        }catch (IllegalArgumentException e){
           MyConsole.print(e.getMessage());
        }

        MyConsole.print("the no of users are "+users.size());

        Set<String> keys = users.keySet();
        for(String key:keys) {
            MyConsole.print("username:"+key);
            MyConsole.print("password:"+users.get(key));
        }
        MyConsole.print(users);
    }

}
