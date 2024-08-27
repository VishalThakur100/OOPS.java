package basicRecursion;

public class NTo1 {
    public static void main(String[] args) {
        int n=5;
       print(n);
//       print2(n);
//       printboth(n);
    }

    private static void printboth(int n) {
        if (n==0){
            return;
        }
        System.out.print(n + " ");
        printboth(n-1);
        System.out.print(n + " ");
    }

    private static void print2(int n) {

        if (n==0){
           return;
        }
        print2(n-1);
        System.out.print(n + " ");
    }

    private static void print(int n) {
        if (n==0){
            return;
        }
        System.out.print(n + " ");
        print(n-1);

    }
}
