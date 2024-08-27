package com.vishal.LinkedList.CircularLL;

public class main {
    public static void main(String[] args) {
        CLL list=new CLL();
        list.insert(3);
        list.insert(7);
        list.insert(9);
        list.insert(45);
        list.display();
        list.delete(9);
        list.display();
    }
}
