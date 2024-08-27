package com.vishal.CollectionsFramework.Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnDeque {
    public static void main(String[] args) {
//        ArrayDeque<Integer> dq=new ArrayDeque<>();
//        dq.offer(89);
//        dq.offerFirst(90);
//        dq.offerLast(20);
//        System.out.println(dq);


        //   priority queue
        Queue<Integer> pr=new PriorityQueue<>();
        pr.offer(23);
        pr.offer(90);
        pr.offer(34);
        pr.offer(21);
        System.out.println(pr);


        //   arraydeque
//        ArrayDeque<Integer> arr=new ArrayDeque<>();
//        arr.offer(90);
//        arr.offer(45);
//        arr.offer(10);
//        arr.offer(9);
//
//        System.out.println(arr);
    }
}
