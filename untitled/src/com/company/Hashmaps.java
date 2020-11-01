package com.company;

import java.util.HashMap;
import java.lang.Integer;
import java.util.IdentityHashMap;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap HM = new HashMap();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        HM.put(i1,"vishal");
        HM.put(i2,"saurabh");//in the hashmap jvm use equals Method for identify key is duplicate or not
        System.out.println(HM);
        //output{10=Saurabh
     ////in the hashmap jvm use equals Method for identify key is duplicate or not
        IdentityHashMap IH=new IdentityHashMap();
        IH.put(i1,"vishal");
        IH.put(i2,"saurabh");
        System.out.println(IH);
        //Output {10=vishal, 10=saurabh}

    }

}
