package basicRecursion;

public class Reverse {
    public static void main(String[] args) {
        int n=3773;
//        System.out.println(reverse(n));
        System.out.println(palindrome(n));
//        reverse2(n);
//        System.out.println(ans);
    }

    private static boolean palindrome(int n) {
        return n==reverse(n);
    }

    static int ans=0;

    private static void reverse2(int n) {

        if (n==0){
            return;
        }
        int rem=n%10;
        ans=ans*10+rem;
        reverse2(n/10);
    }

    private static int reverse(int n) {
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if (n%10==n){
            return n;
        }
        return n%10*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
}
