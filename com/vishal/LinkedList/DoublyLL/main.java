package com.vishal.LinkedList.DoublyLL;

public class main {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.insertfirst(3);
        list.insertfirst(8);
        list.insertfirst(79);
        list.insertlast(5);
        list.display();
        list.insertindex(2,90);
        list.display();
    }
}
