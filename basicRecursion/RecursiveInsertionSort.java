package basicRecursion;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        recursiveinsertion(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void recursiveinsertion(int[] arr, int s) {
        if (s==arr.length-1){
            return;
        }
        for (int i = s+1; i > 0; i--) {
           if (arr[i]<arr[i-1]){
               swap(arr,i,i-1);
           }
        }
        recursiveinsertion(arr,s+1);
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
