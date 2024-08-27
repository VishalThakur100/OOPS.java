package com.vishal.OOPS01;

public class WrapperClass {
    public static void main(String[] args) {
        int a=90;

        //  converting a primitive data type into an object  is =  Wrapper class
        Integer num=45;
        System.out.println(num);
        System.out.println(a);


        //   java is a pass by value and  not pass by reference


        //  final keyword restrict the data type to not be modified  it makes it immutable ( and this immutability holds with primitive datatypes only)
        //  final keyword has to be initialised while declaration

//        final int bonus=45;
//        bonus=46;


        //  when a non primitive is final you cannot reassign it.
        final Student vishal=new Student("thakur");
        vishal.name="mahindra";
//        vishal=new com.vishal.OOPS01.Student("tata");

        Student obj;
        for (int i = 0; i < 1000000000; i++) {
            obj=new Student("pippa");
        }
    }
}

class Student{
    final int num=89;
    String name;
    public Student(String newname) {
        this.name = newname;
    }


    //   finalize automatically remove objects from memory when a certain conditon hit ( and the condition is telling it what to do when the memory is freed )
    //   this is called garbbage collector

    @Override
    protected void finalize() throws Throwable {
//        super.finalize();
        System.out.println("Object is destroyed");
    }
}