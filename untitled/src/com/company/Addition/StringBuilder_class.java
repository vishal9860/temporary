package com.company.Addition;

import java.util.HashMap;
import java.util.Map;

public class StringBuilder_class {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder(25);
        str.append("vishal");
        str.setCharAt(0,'V');
        str.setCharAt(1,'I');
        str.setCharAt(2,'S');
        str.setCharAt(str.indexOf("h"),'H');
        System.out.println("last index of"+str.lastIndexOf("IS"));
        System.out.println(str);
        String vi="goverment college of enginering:aurangabad";
        String array[]=vi.split(":");
        for (String s:array) {
             System.out.println(s);
        }
        System.out.println(vi);
        /*
        System.out.println(vi);
        System.out.print(vi.length());
        str.append("jare");
        String lower= vi.toLowerCase();
        System.out.println(lower);
        String nontrim="      vi sh al   ";
        System.out.println(nontrim.trim());
        vi.split("vi");
        System.out.print(vi);
        */
        String Harry=new String("HARRY_BHAI");
        Harry=Harry.toLowerCase();
        System.out.println(Harry);
        System.out.println(Harry);
        String name="Dear /<name>/ Thanks a lot";
        name=name.replace("/<name>/","vishal");
        System.out.println(name);
        StringBuffer strBuff=new StringBuffer("vishal");
        strBuff.append("jare");
        strBuff.insert(6,"Bapu");
        System.out.println(strBuff);
        strBuff.insert(6," ");
        strBuff.insert(11," ");
        strBuff.delete(7,11);
        System.out.println(strBuff.capacity());
        System.out.println(strBuff);






    }
    public static void printDuplicate(String str){
        char character[]=str.toCharArray();
        Map<Character,Integer> charmap=new HashMap<Character,Integer>();
        for (Character ch:character) {


        }
    }

}
