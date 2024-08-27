package basicRecursion;

public class CountZeroes {
    public static void main(String[] args) {
        int n=0;
        System.out.println(count2(n,0));
    }

    private static int count2(int n, int i) {
        if (n==0){
            return i;
        }
        if (n%10==0){
            return count2(n/10,i+1);
        }
        return count2(n/10,i);
    }

}
