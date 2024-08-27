package A2zDSA;

import java.util.ArrayList;

public class LeftRotateByDPlaces {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        System.out.println("Before Rotate"+":-"+ arr);
        System.out.println("After Rotate"+":-"+rotateArray(arr,3));
    }
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
       reverse(arr,0,k-1);
       reverse(arr,k,arr.size()-1);
       reverse(arr,0,arr.size()-1);
       return arr;
    }
    public static void reverse(ArrayList<Integer> nums,int s,int e){
        while (s<=e){
            int temp=nums.get(s);
            nums.set(s,nums.get(e));
            nums.set(e,temp);
            s++;
            e--;
        }
    }
}
