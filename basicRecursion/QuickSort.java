package basicRecursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quicksort(int[] arr, int low, int high) {
        if (low<high){
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot&&i<high){
                i++;
            }
            while(arr[j]>pivot&&j>low){
                j--;
            }
            if (i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
