package com.company;
class Base{
    public  void printBase(){
    System.out.println("Base constructor");
    }
}
class Derived extends Base{
    public void printDerived(){
        System.out.println("Child class");
    }
}
public class Practical11 {
    public static void main(String[] args) {
     Derived d=new Derived();
     d.printBase();
     d.printDerived();
    }
}
