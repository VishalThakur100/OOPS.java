package com.vishal.OOPS02.staticexample;

public class PackagesAndStatic {
    public static void main(String[] args) {
        System.out.println("heeelo PackagesAndStatic ");
    }
    String name;
    int age;
    int salary;
    boolean married;
    //   static variable is the variable that has no direct relation to the referencing object
    //   it si independent to the object
    static long population;
    public PackagesAndStatic(String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        PackagesAndStatic.population+=1;
    }
}
