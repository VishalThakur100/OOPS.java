package com.vishal.OOPS03.interfaceClass;

public class javaInterface {
    public static void main(String[] args) {
        ram r1=new ram();
        r1.eats();
        r1.legs();
        r1.drinks();

        System.out.println(animal.legs);
    }
}
interface human{
    default void walk(){
        System.out.println("human is walking");
    }
    void eats();
    void talk();
    void drinks();
}
interface animal{
    int legs=4;
    void legs();
    void drinks();
}
class ram implements human,animal{
    public void eats(){
        System.out.println("ram is eating");
    }
    public void talk(){
        System.out.println("ram is talking");
    }
    public void legs(){
        System.out.println("animal has four legs");
    }
    public void drinks(){
        System.out.println("ram is drinking");
    }
}
