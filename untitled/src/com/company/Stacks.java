package com.company;
import java.util.*;
import java.io.*;
public class Stacks {
    public static void main(String[] args) {
        Stack<String>stack1=new Stack<String>();
        stack1.push("vishal");
        stack1.push("jare");
        stack1.push("sachin");
        stack1.push("jare");
        stack1.add("chand");
        stack1.add("jare");
        stack1.add(0,"sushant");//inserting a element at particular index
        Stack<String>stack2=new Stack<String>();
        stack2.add("rohit");//inserting element at end of the stack or top
        stack2.push("virat");
        stack2.push("rishabh");
        stack1.addAll(1,stack2);//it insert collection object at particular index
        System.out.println(stack1.contains("chand"));//it check whether the element is contains in the stack if contain then return true otherwise false
        System.out.println(stack1.containsAll(stack2));//it check whether the  collection element is contains in the stack if contain then return true otherwise false
        System.out.println(stack1.firstElement());//return first element
        System.out.println(stack1.search("virat"));
        System.out.println(stack1);
        System.out.println(stack1.toArray());
        System.out.println(stack1.elementAt(2));//return an element at specific position
        System.out.println(stack1.get(2));//geting element at that position
        System.out.println(stack1.indexOf("vishal"));//getting  index
        System.out.println(stack1.firstElement());//access first element
        System.out.println(stack1.lastElement());//acces last element
        System.out.println(stack1.lastIndexOf("virat"));//getting last index
        stack1.insertElementAt("rahul",2);
        System.out.println(stack1.isEmpty());//Tests if this stackj has no components.
        stack1.removeElementAt(4);//Removes the element at the specified position in this Stack
        stack1.remove("vishal");//remove the element
        stack1.removeAll(stack2);//remove all element of stack2 from stack1
        System.out.println(stack1);
        stack1.set(0,"mumbai");//Replaces the element at the specified position in this Vector with the specified element.
        System.out.println(stack1.indexOf("jare"));
        stack1.removeElementAt(2);
        stack1.removeElementAt(3);
        stack1.removeElementAt(4);
        stack1.set(1,"pune");
        stack1.set(2,"nagpur");
        stack1.set(3,"nashik");
        System.out.println(stack1);
        System.out.println(stack1.subList(0,2));


    }
}
