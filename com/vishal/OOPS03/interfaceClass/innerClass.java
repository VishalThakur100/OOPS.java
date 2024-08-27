package com.vishal.OOPS03.interfaceClass;

public class innerClass {
    class toy{
        int age=9;
    }
    static class tom{
        int roomNo=90;
    }

    public static void main(String[] args) {
        innerClass class1=new innerClass();
        toy t1= class1.new toy();
        t1.age=8;

        tom noroom=new tom();


    }
}
