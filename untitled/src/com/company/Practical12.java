package com.company;
        // Java program to illustrate the
// concept of Multilevel inheritance
import java.util.*;
import java.lang.*;
import java.io.*;

        class one
        {
            public void print_geek()
            {
                System.out.println("First");
            }
        }

        class two extends one
        {
            public void print_for()
            {
                System.out.println("Second");
            }
        }

        class three extends two
        {
            public void print_geek()
            {
                System.out.println("third");
            }
        }

// Drived class
        public class Practical12
        {
            public static void main(String[] args)
            {
                three g = new three();
                g.print_geek();
                g.print_for();
                g.print_geek();
            }
        }



