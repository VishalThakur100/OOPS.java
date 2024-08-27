package com.vishal.exceptionhandling;

public class exceptionHandling {
    public static void main(String[] args) {
        System.out.println("welcome exception handling");
        int[] arr=new int[6];

        try{
            System.out.println(arr[9]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            //    only single finally block is there always
            //    finally block is only one
            System.out.println("always run ");
        }
//        try{
//            System.out.println(arr[9]);
//            int num=7/0;
//
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }


//        try{
//            int num=9/0;
//            System.out.println(arr[7]);
//
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        } catch (ArithmeticException e){
//            System.out.println("error occured");
//            System.out.println(e.getMessage());
//        }
        System.out.println("outside try catch block");
    }
}
