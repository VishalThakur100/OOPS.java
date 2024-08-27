package com.vishal.enums;

public enum Enum {
//    Monday,tuesday,saturday,sunday;

    //   these are instances of enum class
    MONDAY("Monday","somwar"),
    TUESDAY("Tuesday","mangalwar");

    private Enum(String lower,String hindi){
        this.lower=lower;
        this.hindi=hindi;
    };
    private final String lower;

    public String getLower() {
        return this.lower;
    }

    public String getHindi() {
        return this.hindi;
    }

    private final String hindi;

    //  method of enum class
    public void display(){
        System.out.println(this.name());
        System.out.println(this.ordinal());
    }
}
