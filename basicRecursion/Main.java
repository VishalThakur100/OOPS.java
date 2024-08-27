package basicRecursion;

public class Main{
    public static void main(String[] args) {
        print(1);
    }

//    recursion types
//            parameterized recursion and funtional recursion

    private static void print(int i) {
        if (i==5){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        print(i+1);
    }
}