package A2zDSA;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
       ArrayList<Long> arr=new ArrayList<>();
       arr.add(1L);
       arr.add(3L);
        arr.add(5L);
        arr.add(9L);
        arr.add(7L);
        System.out.println("Before reverse");
        for ( Long a: arr
             ) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("After reverse");
        reverseInGroups(arr,3);
//        for (int i = 0; i < arr.toArray().length; i++) {
//            System.out.print();
//        }
        for (Long temp: arr
             ) {
            System.out.print(temp+" ");
        }
    }
   public static void reverseInGroups(ArrayList<Long> arr, int k) {
       for (int i = 0; i < arr.toArray().length-1; i=i+k) {
           int start=i;
           int last=Math.min(arr.toArray().length-1, i+k-1);
           while (start<=last){
                Long temp=arr.get(start);
                arr.set(start,arr.get(last));
                arr.set(last,temp);
                start++;
                last--;

           }
       }
    }
}
