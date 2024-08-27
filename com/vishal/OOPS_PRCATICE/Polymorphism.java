package com.vishal.OOPS_PRCATICE;

import java.util.ArrayList;
import java.util.List;

class Data{
    int num;
    String name;
    void printData(){
        System.out.println("Data is printed");
    }

}
class ChildData extends Data{
    void printData(){
        System.out.println("Childdata is printed");
    }
    void getname(){

    }
}
public class Polymorphism {
//    List<Integer> arr=new ArrayList<>();
public static void main(String[] args) {
    Data d=new ChildData();
    Object obj=new ChildData();

    ChildData c1=new ChildData();
    c1.getname();
    d.printData();
}


}
