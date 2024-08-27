package A2zDSA;

import java.util.Arrays;

public class REverseAnArray {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,7,9};
        for (int i = 0; i < arr.length-i-1; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
