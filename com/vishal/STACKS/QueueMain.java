package com.vishal.STACKS;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        CustomQueue customQueue = new CustomQueue(4);
        customQueue.insert(90);
        customQueue.insert(67);
        customQueue.insert(56);
        customQueue.insert(34);

        customQueue.display();
        System.out.println(customQueue.remove());
        customQueue.display();
    }
}
