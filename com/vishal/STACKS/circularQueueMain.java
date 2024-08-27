package com.vishal.STACKS;

public class circularQueueMain {
    public static void main(String[] args) throws Exception {
        circularQueue circularQueue = new DynamicCircularQueue();
       circularQueue.insert(23);
       circularQueue.insert(3);
       circularQueue.insert(2);

        circularQueue.display();
        circularQueue.remove();
        circularQueue.display();

    }


}
