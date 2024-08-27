package com.vishal.STACKS;

public class StackMain {
    public static void main(String[] args) throws Exception{
        CustomStack customStack = new DynamicStack(5);
        customStack.push(23);
        customStack.push(2);

        System.out.println(customStack.pop());
        System.out.println(customStack.pop());

    }
}
