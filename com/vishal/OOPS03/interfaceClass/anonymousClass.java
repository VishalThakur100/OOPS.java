package com.vishal.OOPS03.interfaceClass;

public class anonymousClass {
        //  anonymous class
        //    class shop extends bank{ }
        bank b1=new bank(){
            void sing(){

            }
            public void greeting(){

            }
        };

        outerInterface obj1=new outerInterface() {
            //    anonymous class with outerinterface interface
            @Override
            public void name() {

            }
        };

        //   lambda expression   with anonymous class
    oneInterface obj3=()->{
            System.out.println("this is functional interface method ");
        };
    //   here obj1 and obj3 are equal
    public static void main(String[] args) {
        twoInterface obj5=(steps)-> 2*steps;
        System.out.println(obj5.steps(9));
    }

}
interface twoInterface{
    int steps(int steps);
}
@FunctionalInterface
interface oneInterface{
     void polo();
}
interface outerInterface{
     void name();
}

//  outer class
class bank{
    public  void greeting(){
        System.out.println("welcome");
    }
}
