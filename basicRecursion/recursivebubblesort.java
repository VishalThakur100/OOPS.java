package basicRecursion;

import java.util.Arrays;

public class recursivebubblesort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        recursivebubble(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void recursivebubble(int[] arr, int e) {
        if (e==1){
            return;
        }
        boolean flag=false;
        for (int i = 0; i <= e-2; i++) {
            if (arr[i]>arr[i+1]){
                swap(arr,i,i+1);
                flag=true;
            }
        }
        if (!flag){
            return;
        }
        recursivebubble(arr,e-1);

    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
