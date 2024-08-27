package com.vishal.enums;

public class enumerators {
    public static void main(String[] args) {
//        System.out.println(Enum.Monday);
//        System.out.println(Enum.saturday);
//
//        //    it gives index of the s pecified value
       Enum day=Enum.MONDAY;
       day.display();
        System.out.println(day.getHindi());
        System.out.println(day.getLower());
        System.out.println(day.ordinal());
//        day.display();
//        int ordinal=day.ordinal();
//        System.out.println(ordinal);
//
//        System.out.println(Enum.saturday.ordinal());
//
//        //    .name gives an string in order to perform string operations
//        System.out.println(day.name().toLowerCase());

        //    it will itearte on all the enum values and return the value if it is present on the enum class
//        Enum enumDay=Enum.valueOf("Monday");
//        System.out.println(enumDay);

//        Enum[] num=Enum.values();
//        for (Enum it: num
//             ) {
//            System.out.println(it);
//        }

//        String res= switch (day){
//            case Monday-> "Monday";
//            case tuesday-> "Tuesday";
//            default -> "Weekend";
//        };
//        System.out.println(res);
    }
}
