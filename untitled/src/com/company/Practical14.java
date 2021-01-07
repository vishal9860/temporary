package com.company;

// Java program to demonstrate
// implement static and non-static
//  inner classes in a Java program.
class OuterClass {
    private static String msg = "Goverment";

    // Static inner class
    public static class InnerStaticClass {

        public void printMessage()
        {

            System.out.println(
                    "Message from nested static class: "
                            + msg);
        }
    }

    // Non-static inner class -
    public class InnerClass {

        public void display()
        {
            System.out.println(
                    "Message from non-static nested class: "
                            + msg);
        }
    }
}
class Practical14{
    public static void main(String args[])
    {

        // Create instance of  Static inner class
        OuterClass.InnerStaticClass printer
                = new OuterClass.InnerStaticClass();

        // Call non static method of static inner class
        printer.printMessage();


        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner
                = outer.new InnerClass();

        // Calling non-static method of Inner class
        inner.display();

        // We can also combine above steps in one
        // step to create instance of Inner class
        OuterClass.InnerClass innerObject
                = new OuterClass().new InnerClass();

        // Similarly we can now call Inner class method
        innerObject.display();
    }
}

