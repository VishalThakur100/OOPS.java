package A2zDSA;

import java.util.Arrays;

public class MissingandRepeating {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,1,1};
//        System.out.println(Arrays.toString(findMissRep(arr)));
        System.out.println(Arrays.toString(findTwoElement(arr, arr.length)));
    }

    private static int[] findTwoElement(int[] arr, int n) {
        long Sn=((long) n *(n+1))/2;
        long S2n=((long) n*(n+1)*(2L *n+1))/6;
        long S=0;
        long S2=0;
        for (int i = 0; i < n; i++) {
            S+= arr[i];
            S2+= (long) arr[i] *arr[i];
        }
        long val1=S-Sn;  //  x-y
        long val2=S2-S2n;
        val2=val2/val1;   //  x+y
        long x=(val1+val2)/2;
        long y=x-val1;
        return new int[]{(int)x,(int)y};
    }


    private static int[] findMissRep(int[] arr) {
        //   brute force solution
        int repeating=-1;
        int missing=-1;
        for (int i = 1; i <= arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]==i){
                    count++;
                }
            }
            if (count==2){
                repeating=i;
            }else if (count==0){
                missing=i;
            }
            if (repeating!=-1 && missing!=-1){
                break;
            }
        }
        return new int[]{repeating,missing};
    }
}
