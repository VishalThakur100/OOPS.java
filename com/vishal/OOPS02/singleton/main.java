package com.vishal.OOPS02.singleton;

public class main {
    public static void main(String[] args) {
        Singleton obj1=Singleton.getInstance();
        System.out.println(obj1);
        Singleton obj2=Singleton.getInstance();
        System.out.println(obj2);
        Singleton obj3=Singleton.getInstance();
        System.out.println(obj3);
    }
}

class Singleton{
    private Singleton(){

    }
    private static Singleton instance;
    public static Singleton getInstance(){
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
