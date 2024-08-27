package com.vishal.exceptionhandling;

public class main {
    public static void main(String[] args) throws Exception {
//        main.divide(3,0);
        int a=5;
        int b=0;
        try {
//           divide(a,b);
           throw new Exception("just for fun");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("new exception");
        } finally {
            System.out.println("always execute");
        }
    }
    static int divide2(int a , int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("please do not divide by zero");
        }
        return a/b;
    }
    static int divide(int a ,int b){
        return a/b;
    }

}
