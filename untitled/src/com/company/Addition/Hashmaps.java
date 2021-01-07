package com.company.Addition;

import java.util.HashMap;
import java.util.Map;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<String,Integer>hmap=new HashMap<>();
        hmap.put("vishal",1998);
        hmap.put("sachin",1999);
        hmap.put("chandrakant",2000);
        hmap.put("satish",2001);
        for(Map.Entry<String,Integer>e: hmap.entrySet()){
            System.out.println("key is "+e.getKey());
            System.out.println("value is "+e.getValue());
        }
    }
}
