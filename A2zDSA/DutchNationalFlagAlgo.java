package A2zDSA;

import java.util.Arrays;

public class DutchNationalFlagAlgo {
    public static void main(String[] args) {
        int[] arr={2,0,1};
        DNF(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void DNF(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if (nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            } else if (nums[mid]==1) {

            }else {
                swap(nums,mid,high);
                mid++;
                high--;
            }
        }
    }
    public static void swap(int[] arr,int a ,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
