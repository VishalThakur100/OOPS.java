package A2zDSA;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        int[] arr={1,1,1,1};
        System.out.println(checkSorted(arr,arr.length-1));
    }

    private static boolean checkSorted(int[] arr,int n) {
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
