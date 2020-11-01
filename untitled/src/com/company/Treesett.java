package com.company;
import java.util.Comparator;
import java.util.TreeSet;

class Compare implements Comparator{
  public int compare(Object obj1,Object obj2){
      String s1= obj1.toString();
      String s2=obj2.toString();
      return s1.compareTo(s2);
  }
}
public class Treesett {
    public static void main(String[] args) {
        TreeSet str=new TreeSet(new Compare());
        str.add(new StringBuffer("vishal"));
        str.add(new StringBuffer("sudhir"));
        str.add(new StringBuffer("Akabar"));
        str.add(new StringBuffer("ganesh"));
        System.out.println(str);
    }
}
