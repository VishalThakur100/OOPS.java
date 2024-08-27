package com.vishal.CollectionsFramework.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        List<String > arr=new ArrayList<>();
        arr.add("mango");
        arr.add("apple");
        arr.add("banana");
//        Iterator<String> it=arr.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        System.out.println(arr.subList(1,2));
    }
}
