package com.vishal.OOPS03.abstraction;

public class abstraction {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.accelerate();

    }

}
abstract  class vehicle{
    abstract void accelerate();
    abstract void gear();
}
class Car extends vehicle{
    @Override
    void accelerate(){
        System.out.println("this is accelerating");
    }

    @Override
    void gear() {
        System.out.println("this car has gears");
    }

}