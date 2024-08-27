package A2zDSA;

import java.util.Arrays;

public class ReverseUsingRecursion {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        System.out.println(Arrays.toString(Reverse(arr,0,arr.length-1)));
    }

    private static int[] Reverse(int[] arr, int i, int length) {
        if (i>=length){
            return arr;
        }
        int temp=arr[i];
        arr[i]=arr[length];
        arr[length]=temp;

//        note never pass increment operator in function recursion

        return Reverse(arr,++i,--length);
    }
}
