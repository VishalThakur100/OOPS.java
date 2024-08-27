package com.vishal.STACKS;

public abstract class circularQueue {
    protected int size=0;
    protected int front=0;
    protected int end=0;
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    public circularQueue() {
        this(DEFAULT_SIZE);
    }
    public circularQueue(int size) {
        this.data = new int[size];
    }
    public boolean insert(int item) throws Exception{
        if (isFull()){
            throw new Exception("Queue is full cannot insert element");
        }
        data[end++]=item;
        end=end% data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty cannot remove element");
        }
        int removed=data[front++];
        front=front%data.length;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }
    public void display() throws Exception{
       if (isEmpty()){
           throw new Exception("Queue Empty");
       }
       int i=front;
       do {
           System.out.print(data[i]+"<- ");
           i++;
           i=i% data.length;
       }while (i!=end);
        System.out.println("END");
    }
    public boolean isFull() {
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }

   }

class DynamicCircularQueue extends circularQueue{
    public DynamicCircularQueue(){
        super();
    }
    public DynamicCircularQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) throws Exception{
        if(this.isFull()){
            int[] temp=new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[(front+i)% data.length];
            }
            front=0;
            end= data.length;
            data=temp;
        }
        return super.insert(item);
    }
}