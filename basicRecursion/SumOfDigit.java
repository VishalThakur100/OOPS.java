package basicRecursion;

public class SumOfDigit {
    public static void main(String[] args) {
        int n=888 ;
//        System.out.println(sum(n));
        System.out.println(product(n));
    }

    private static int product(int n) {
        if (n%10==n){
            return n;
        }
        return product(n/10) * (n%10);
    }

    private static int sum(int n) {
        if (n==0){
            return 0;
        }
        return sum(n/10) + (n%10);
    }
}
