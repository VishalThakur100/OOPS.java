package com.vishal.OOPS02.staticexample;


import com.sun.tools.javac.Main;

public class main {

    //  main is static because it can be used without creating a object of the class main
    //  hence it is static
    public static void main(String[] args) {
//        System.out.println("HII howdy");
//        greeting();

//        PackagesAndStatic vishal=new PackagesAndStatic("vishal",20,150000,false);
//        PackagesAndStatic rahul=new PackagesAndStatic("rahul",22,10000,false);

//        static variable can be accesed without creating a new object
//        System.out.println(PackagesAndStatic.population);

//        Main b=new Main();
//        b.fun1();
    }


    // this is not dependent on the object
    static void fun1(){
//        System.out.println(Human.population);
//        Main a=new Main();
//        a.fun2();
    }


    // if something is not static it is dependent on object
    void fun2(){
        System.out.println("hello davidson");
    }
}

