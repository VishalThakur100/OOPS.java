package com.vishal.OOPS01.wrapperClass;

import com.vishal.OOPS01.B;

public class wraperClass {
    public static void main(String[] args) {
        //   autoboxing  and unboxing

//        Integer num=new Integer(90);
//        System.out.println(num);

        Integer a=Integer.valueOf("23");     //  string to Integer
//        System.out.println(a);
        Boolean b= Boolean.valueOf("false");    //  string to boolean
        System.out.println(b);
/*
      *//*  Integer num2=Integer.valueOf(30);
        System.out.println(num2);
        Integer num3=80;      //    autoboxing  conversion of primitive to object of wrapper class
        System.out.println(num3);
        int age=num;         //    unboxing converion of object of wrapper class to primitive data type
        System*//*.out.println(age);*/
    }
}
