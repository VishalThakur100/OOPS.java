package A2zDSA;

//import static java.util.Collections.swap;

import java.util.Arrays;

public class nextPermutation {
    public static void main(String[] args) {
        int[] arr={3,2,1};
        int n=arr.length;
        System.out.println(Arrays.toString(nextpermute(arr,n)));
    }

    public static int[] nextpermute(int[] arr,int n){
        int index=getindex(arr);
        if (index==-1){
            return arr;
        }
        for (int i = n-1; i >= index; i--) {
            if (arr[i]>arr[index]){
                swap(arr,i,index);
                break;
            }
        }

        for (int i = index+1; i < n; i++) {
            swap(arr,i,n-1);
            n--;
        }
        return arr;
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


    private static int getindex(int[] arr) {
        int idx=-1;
        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i]<arr[i+1]){
                idx=i;
                return i;
            }
        }
        return idx;
    }
}
