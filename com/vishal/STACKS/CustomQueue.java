package com.vishal.STACKS;

public class CustomQueue {
    int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=0;
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) throws Exception{
        if (isFull()){
            throw new Exception("Queue is full cannot insert element");
        }
        data[ptr++]=item;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new CustomQueueException("Queue is empty cannot remove any item");
        }
        int removed=data[0];
        for (int i = 1; i < ptr; i++) {
            data[i-1]=data[i];
        }
        ptr--;
        return removed;
    }

    public int front() throws Exception{
        if (isEmpty()){
            throw new CustomQueueException("Queue is Empty");
        }
        return data[0];
    }
    public void display() throws Exception{
        if (isEmpty()){
            throw new CustomQueueException("Queue is Empty");
        }
        for (int i = 0; i < ptr; i++) {
            System.out.print(data[i]+"<-");
        }
        System.out.println("END");
    }

    public boolean isFull() {
        return ptr==data.length;
    }
    public boolean isEmpty(){
        return ptr==0;
    }
}

class CustomQueueException extends Exception{
    public CustomQueueException(String message) {
        super(message);
    }
}
