package com.company;
import java.applet.Applet;
import java.awt.*;
public class MyApplet extends Applet {
    Label l1,l2;
    TextField t1,t2;
    Button b1;
    public void init(){
        l1=new Label("First number");
        l1=new Label("Second number");
        t1=new TextField();
        t2=new TextField();
        b1=new Button("add");
        setLayout(null);
        l1.setBounds(30,50,100,20);
    }
}
