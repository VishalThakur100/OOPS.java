package com.vishal.CollectionsFramework.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Student{
    //   pojo :-  plain old java object
    String name;
    int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class setInterface {
    public static void main(String[] args) {
//        Set<Integer> set=new HashSet<>();    //   elements not stored in sequence
//        Set<Integer> arr=new LinkedHashSet<>();  //   elements stored int sequence


        Set<Student> set=new HashSet<>();
        set.add(new Student("aman",90));
        set.add(new Student("aman",90));
        System.out.println(set);

//        set.add(90);
//        set.add(10);
//        set.add(9);
//
//        arr.add(45);
//        arr.add(5);
//        arr.add(4);
//        System.out.println(arr);
    }
}
