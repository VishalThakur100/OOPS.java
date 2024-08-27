package A2zDSA;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println( fact(n));
    }
//    funtional recursion
    public  static int fact(int n){
        if (n==1){
            return 1;
        }
        return n*fact(n-1);
    }
//    parameterized factorial
//    public static void fact(int n,int ans){
//        if (n==1){
//            System.out.println(ans);
//            return;
//        }
//        fact(n-1,ans*n);
//    }

}
