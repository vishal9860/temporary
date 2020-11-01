package com.company;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<Integer,String>M=new HashMap<>();
        M.put(25,"vishal");
        M.put(24,"suvidhe");
        M.put(16,"Mahadeo");
        M.put(12,"Amol");
        M.put(22,"Laxmikant");
        M.containsKey(25);
        M.containsValue("vishal");
        M.get(25);
        Collection c=M.values();
        System.out.println(c);
        System.out.println();
        Set s=M.keySet();//[k,k,k,k]
        System.out.println(M.entrySet());
        Set set=M.entrySet();//[k,v,k,v,k,v,k,v]
        System.out.println(s);
        Iterator itr=set.iterator();
        while (itr.hasNext()){
            Map.Entry M1=(Map.Entry)itr.next();
            if(M1.getKey().equals("16")){
                M1.setValue(15);
            }
        }
        Map<String,String>Maps=new Map<String, String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public String get(Object key) {
                return null;
            }

            @Override
            public String put(String key, String value) {
                return null;
            }

            @Override
            public String remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ? extends String> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<String> values() {
                return null;
            }

            @Override
            public Set<Entry<String, String>> entrySet() {
                return null;
            }
        };
    }
}
