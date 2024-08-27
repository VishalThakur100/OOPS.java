package com.vishal.OOPS03.inheritance;

public class BoxWeight extends BOX{
    double weight;

    BoxWeight(){
        super();
        this.weight=weight;
    }
    public BoxWeight(double weight) {
        super();
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);  // call the parent class constructor
        // used to initialize values present in parent class
        this.weight = weight;
    }
}
