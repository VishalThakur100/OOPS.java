package com.vishal.LinkedList.DoublyLL;

public class DLL {
    private Node head;
    private Node tail;
//    private int size;
//
//    public DLL() {
//        this.size = 0;
//    }

    public void insertfirst(int value){
        Node node =new Node(value);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev=node;
        }
        head=node;
    }
    public void display(){
        Node temp=head;
        Node last=null;
        while (temp!=null){
            System.out.print(temp.value+" -> ");
            last=temp;
            temp=temp.next;
        }
        System.out.println("End");
//        System.out.println("Print in Reverse");
//        while (last!=null){
//            System.out.print(last.value+" -> ");
//            last=last.prev;
//        }
//        System.out.println("End");
    }
    public Node find(int index){
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }
    public void insertindex(int after,int value){

        Node temp=find(after);
        if (temp==null){
            System.out.println("does not exists");
            return;
        }
        Node node=new Node(value);
        node.next=temp.next;
        temp.next=node;
        node.prev=temp;
        if (node.next!=null){
            node.next.prev=node;
        }
    }
    public void insertlast(int value){
        Node node =new Node(value);
        Node last=head;
        node.next=null;
        if (head==null){
            head=node;
            node.prev=null;
            return;
        }
        while (last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
