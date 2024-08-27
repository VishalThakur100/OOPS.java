package com.vishal.LinkedList.SinglyLL;

public class LL {
    private Node  head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
    }
    public void insert(int value,int index){
        if (index==0){
            insertfirst(value);
            return;
        }
        if (index==size){
            insertlast(value);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
    }
    public int deletelast(){
        if (size<=1){
            deletefirst();
        }
        Node secondlast=get(size-2);
        int value=tail.value;
        tail=secondlast;
        tail.next=null;
        return value;
    }

    public Node get(int index){
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }
    public int deletefirst(){
        int temp=head.value;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return temp;
    }
    public Node find(int value){
        Node temp=head;
        while (temp!=null){
            if (temp.value==value){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public int deleteindex(int index){
        if (index==0){
            return deletefirst();
        }
        if (index==size-1){
            return deletelast();
        }
        Node prev=get(index-1);
        int value=prev.next.value;
        prev.next=prev.next.next;
        return value;
    }
    public void insertfirst(int value){
        Node node =new Node(value);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size+=1;
    }

    //  insert using recursion
    public void insertRec(int index,int value){
        head=insertRec(index,value,head);
    }
    private Node insertRec(int index,int value,Node node){
        if (index==0){
            Node temp=new Node(value,node);
            size++;
            return temp;
        }
        node.next=insertRec(index-1,value,node.next);
        return node;
    }
    public void insertlast(int value){
        if (tail==null){
            insertfirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size+=1;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("End");
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }


    //  Leetcode question

    public void removeDuplicates(){
        Node temp=head;
        while(temp.next!=null){
            if (temp.value==temp.next.value){
                temp.next=temp.next.next;
                size--;
            }
           else {
                temp=temp.next;
            }
        }
        tail=temp;
        tail.next=null;
    }

    //   merge two lists

    public static LL mergeLL(LL first, LL second){
        Node f=first.head;
        Node s=second.head;
        LL ans=new LL();
        while(f!=null && s!=null){
            if (f.value<=s.value){
                ans.insertlast(f.value);
                f=f.next;
            }else {
                ans.insertlast(s.value);
                s=s.next;
            }
        }
        while(f!=null){
            ans.insertlast(f.value);
            f=f.next;
        }
        while(s!=null){
            ans.insertlast(s.value);
            s=s.next;
        }
        return ans;
    }

    //   detect cycle   using slow and fast pointer


}
