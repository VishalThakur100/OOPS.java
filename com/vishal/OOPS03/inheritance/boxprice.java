package com.vishal.OOPS03.inheritance;

public class boxprice extends BoxWeight{
    double price;
    boxprice(){
        super();
        System.out.println("under boxprice");
    }
   boxprice(double price){
        super();
       this.price=price;
   }

}
