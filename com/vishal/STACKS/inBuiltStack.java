package com.vishal.STACKS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class inBuiltStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
//        stack.push(23);
//        stack.push(90);
//        stack.push(27);
//        stack.push(2);
        System.out.println(stack.isEmpty());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        Queue<Integer> queue=new LinkedList<>();
        queue.add(89);
        queue.add(9);
        queue.add(8);
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());

//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
    }
}
