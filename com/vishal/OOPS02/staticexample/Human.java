package com.vishal.OOPS02.staticexample;

public class Human {
    int age;
    String name;
    long salary;
    static long population;

    static void message(){
        System.out.println("hello java");
    }
    public Human(int age, String name, long salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population+=1;
    }
}
