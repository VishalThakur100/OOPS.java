package com.vishal.exceptionhandling;

public class ThrowsException {
    public static void main(String[] args) {
        try{
            int age=10;
            if(age>9){
                throw new ArithmeticException();
//                throw new myEception("error");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }


//    static int getNumber() throws ArithmeticException{
//        //    throws specifies the type of exception that this might throws an  exception
//        return 9/0;
//    }
}
class myEception extends Exception{
    public myEception(){
        super("error occured");
    }
    public myEception(String msg){
        super(msg);
    }
}
