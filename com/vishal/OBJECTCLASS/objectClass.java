package com.vishal.OBJECTCLASS;

class Car{
    int model;
    String name;
    Car(int model,String name){
        this.name=name;
        this.model=model;
    }
    public boolean equals(Car obj){
        if(this.model==obj.model && this.name==obj.name){
            return true;
        }
        return false;
    }
    public String toString(){
        return this.name+" model is "+this.model;
    }
}
public class objectClass {
    public static void main(String[] args) {
        Car c1=new Car(23,"I10");
        Car c2=new Car(23,"I10");
        System.out.println(c1.equals(c2));

        System.out.println(c1.toString());
    }
}
