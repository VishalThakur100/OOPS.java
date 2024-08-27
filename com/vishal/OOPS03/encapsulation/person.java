package com.vishal.OOPS03.encapsulation;

public class person {
    public static int count;
    public person(){
        count++;
    }
    public  static String city="Noida";
    private int age;
    private String name;
    boolean canBeChanged=true;
    protected void setAge(int age){
        if(canBeChanged){
            if(age>0) {
                this.age = age;
            }
        }
    }
    boolean canBeAccessed=true;
    protected int getAge(){
        if(canBeAccessed){
            return age;
        }
        return -1;
    }


}
