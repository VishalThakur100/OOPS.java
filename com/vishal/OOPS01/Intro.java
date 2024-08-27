package com.vishal.OOPS01;

public class Intro {
    public static void main(String[] args) {

//        com.vishal.OOPS01.student vishal=new com.vishal.OOPS01.student(15,"tushar",91);
//        com.vishal.OOPS01.student vishal=new com.vishal.OOPS01.student(123,"kunal",23);
//        com.vishal.OOPS01.student vishal=new com.vishal.OOPS01.student();
//        com.vishal.OOPS01.student random =new com.vishal.OOPS01.student();
//        System.out.println(random.name);
//        System.out.println(random.name);
//        System.out.println(random.rollno);
//        System.out.println(random.marks);
//        vishal.getname("thakur");
//        System.out.println(vishal.name);
//        System.out.println(vishal.marks);

//        vishal.greeting();

        student one=new student();
        student two=one;
        one.name="anant";
        System.out.println(two.name);

//        com.vishal.OOPS01.student aman=new com.vishal.OOPS01.student();
//        aman.name="thakur";
//        aman.greeting();
    }
}
class student{

    // this are properties
    int rollno;
    String name;
    int marks;

    //   this is function
    void getname(String newname){
        this.name=newname;
    }
    void greeting(){
        System.out.println("my name is " + this.name);
    }

    // this is constructor
    student (){
        //  this is how you call a constructor from another constructor
        //  this will replace with =>  new com.vishal.OOPS01.student(190,"sparsh",00);
       this(190,"Sparsh",00);
    }

    student(student other){
        this.rollno=other.rollno;
        this.name=other.name;
        this.marks= other.marks;
    }

//    imp note :  name of class variables and passing variables does not have to be same
    //  or use this keyword along with class variables name
    student(int rollno,String name,int marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
}