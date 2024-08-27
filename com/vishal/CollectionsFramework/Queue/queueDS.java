package com.vishal.CollectionsFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueDS {
    public static void main(String[] args) {
        Queue<Integer> num=new LinkedList<>();
        num.offer(89);
        num.offer(9);  //  add
        num.offer(8);
        num.offer(90);

        System.out.println(num.peek());
        while(!num.isEmpty()){
            System.out.println(num.poll());    //  remove
        }
        System.out.println(num);
    }
}
