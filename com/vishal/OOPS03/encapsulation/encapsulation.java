package com.vishal.OOPS03.encapsulation;

import java.util.Arrays;

public class encapsulation {
    static {
        System.out.println("This is my first static block");
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        person p1=new person();
//        person.count =90;
//        p1.age=89;
//        p1.setAge(0);
//        System.out.println(p1.getAge());
        person p2=new person();
        p2.city="Delhi";
        person p3=new person();

        System.out.println(person.count);
        System.out.println(person.city);

//            static example
//        System.out.println(Math.max(2,9));  //   here Math is a class and max is a static method thats why do not need to create an instance of the Math class in order to access the max method
        System.out.println(person.count);
    }
    static{
        System.out.println("this is my second static block");
    }
}
