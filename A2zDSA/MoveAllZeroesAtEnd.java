package A2zDSA;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Collections.swap;

public class MoveAllZeroesAtEnd {
    public static void main(String[] args) {
        int[] arr={1,0,0,2,0,0,3,4,1,0,0};
//        int[] temp=new int[arr.length];
//        int j=0;

        //  brute force approach

//        ArrayList<Integer> temp=new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]!=0){
//               temp.add(arr[i]);
//            }
//        }
//        for (int i = 0; i < temp.size(); i++) {
//            arr[i]=temp.get(i);
//        }
//        for (int i = temp.size(); i < arr.length; i++) {
//            arr[i]=0;
//        }

        //  optimal approach

        int j=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                j=i;
                break;
            }
        }
        for (int i = j+1; i < arr.length; i++) {
            if (arr[i]!=0){
                swap(arr,j,i);
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr ,int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
