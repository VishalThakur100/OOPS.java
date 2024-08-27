package basicRecursion;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr= {1,3,5,7,9};
        System.out.println(Check(arr,0));
    }

    private static boolean Check(int[] arr, int i) {
        if (i==arr.length-1){
            return true;
        }
        return arr[i]<=arr[i+1] && Check(arr,i+1);
    }
}
