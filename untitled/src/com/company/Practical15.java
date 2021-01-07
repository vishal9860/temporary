package com.company;
abstract class AbstractDemo{
    public void myMethod(){
        System.out.println("Hello");
    }
    abstract public void anotherMethod();
}
class Demo extends AbstractDemo {

    public void anotherMethod() {
        System.out.print("Abstract method");
    }
}
public class Practical15 {
    public static void main(String[] args) {
        Demo D=new Demo();
        D.myMethod();
        D.anotherMethod();
    }
}
