package com.vishal.OOPS02.staticexample;

public class StaticBlock {
    static int a=9;
    static int b;

    //  this will only runs once when the object is created i.e when the class is loaded for the very first time

    static {
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj1=new StaticBlock();
        System.out.println(obj1.a);
        System.out.println(StaticBlock.b);

//        System.out.println(a);
//        System.out.println(b);
    }
}
