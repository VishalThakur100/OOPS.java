package com.vishal.OOPS03.inheritance;

public class BOX {
    double l;
    double h;
    double w;

    BOX(){
         this.l=-1;
         this.h=-1;
         this.w=-1;
    }
    BOX(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }

    BOX(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    BOX (BOX old){
        this.l=old.l;
        this.h= old.h;
        this.w=old.w;
    }
    public static void displayinfo(){
        System.out.println("inside display function");
    }
}
