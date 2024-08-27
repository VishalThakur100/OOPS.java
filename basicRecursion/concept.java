package basicRecursion;

public class concept {
    public static void main(String[] args) {
        int n=5;
        fun(n);
    }

    private static void fun(int n) {
        if (n==0){
            return;
        }
        System.out.print(n+ " ");
        fun(--n);
    }
}
