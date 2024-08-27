package com.vishal.OOPS_PRCATICE;

public class OOPS01 {
    public static void main(String[] args) {
//        Complex num=new Complex(3,5);
//        num.print();
//        Dog d1=new Dog("tuffy",4,"brown");
//        d1.bark();
//        Dog d2=new Dog("sparsh",5,"Black");
//        d2.walk();
//        Student stu1=new Student();
//        stu1.name="Thakur";
//        stu1.greet(9);
        Student v1=new Student();
        Student v2=new Student();
        v1.name="Akash";
        System.out.println(v1.name);
    }
}
class Student{
    //     method overloading {same name function can be used for different task as long as they have different no. of arguments and also type shoul be different}
    //    return type does not determine the calling object reference
    String name;
    int age;
    void greet(int count){
        System.out.println(count+"greet");
    }
    void greet(String name){
        System.out.println(name+"its me ");
    }
//    void greet(int num,int code){
//
//    }
//    public Student(){
//        this.age=
//    }
}
class Dog{
    String name;
    int age;
    String color;
    public Dog(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    void bark(){
        System.out.println(name+" is barking");
    }
    void walk(){
        System.out.println(name+" is walking");
    }
}

class Complex{
    int real;
    int imag;
    public Complex(int a,int b){
        this.real=a;
        this.imag=b;
    }
    void print(){
        System.out.println(real+" + "+imag+"i");
    }

}