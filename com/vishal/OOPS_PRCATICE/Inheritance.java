package com.vishal.OOPS_PRCATICE;

public class Inheritance {
    public static void main(String[] args) {
        Car a=new Car("fortuner");
        a.wheelCount=4;
//        a.gears=9;
        a.info();
        a.start();

    }

    public static class Vehicle {
        int wheelCount;
         final int gears=4;
        Vehicle(){
            System.out.println("default constructor called");
        }
        Vehicle(int count){
            System.out.println(count+"this is wheel counts");
        }

        void start(){
            System.out.println("vehicle is starting");
        }
    }
    public final static class Car extends Vehicle{
        String name;

        Car(){
//            super();
            super(8);
            System.out.println("this is my car");
        }
        public Car(String name) {
            this.name = name;
        }

        void start(){
            System.out.println(this.name+" is starting");
        }
        void info(){
            System.out.println("I10");
        }
    }
}
