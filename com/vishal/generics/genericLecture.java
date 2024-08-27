package com.vishal.generics;

import com.vishal.OOPS03.polymorphism.Numbers;

public class genericLecture {
    public static void main(String[] args) {
//        Dog<String,Integer> d1=new Dog<>("Bull");
//        Dog<Integer,String > d2=new Dog<>(12,"Leonardo");
//        Dog<Integer,Integer> d3=new Dog<>(23,45);
//        System.out.println(d1.breed);
//        getName("vishal");
//        getName(23);
        genericLecture obj1=new genericLecture();   //    non-static method cannot be called from static
        obj1.greetMe("bard");
        obj1.greetMe(34);

        //   this is also a type of generic calling
        obj1.<String>greetMe("aman");
        obj1.namaste(90);

    }

    //   bounded generic
    <T extends Number> void namaste(T name){
        System.out.println("hello bounded generic");
    }
    static <S> void getName(S name){
        System.out.println(name);
    }
    <E> void greetMe(E name){
        System.out.println(name);
    }
}


//    declaring at the runtime which type of paramaters are passed to make an object to desired class is known as generics
class Dog<S,I>{
    S breed;
    I age;
    S name;
    public Dog(S breed){
        this.breed=breed;
    }
    public Dog(S name,I age){
        this.name=name;
        this.age=age;
    }
}