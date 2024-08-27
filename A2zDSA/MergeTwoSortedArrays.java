package A2zDSA;
import java.util.Arrays;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        int[] nums = {2,4,6,8};
        gapMergeSort(arr,nums,arr.length,nums.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums));
    }
    public static void swap(int[] arr,int[] nums,int left,int right){
        if(arr[left]>=nums[right]){
           int temp=arr[left];
           arr[left]=nums[right];
           nums[right]=temp;
        }
    }
    private static void gapMergeSort(int[] arr, int[] nums, int n, int m) {
        int len=m+n;
        int gap =  (len/2)+(len%2);
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right < len){
                if(left<n && right >= n){
                    swap(arr,nums,left,right-n);
                } else if (left>=n) {
                    swap(nums,nums,left-n,right-n);
                }else {
                    swap(arr,arr,left,right);
                }
                left++;
                right++;
            }
            if(gap==1) break;
            gap=(gap/2)+(gap%2);
        }
    }
}


  /* 1st optimal approach
           while (left >= 0 && right < nums.length) {
        if (arr[left] > nums[right]) {
        int temp = arr[left];
        arr[left] = nums[right];
        nums[right] = temp;
        left--;
        right++;
        }else {
        break;
        }
        }
        Arrays.sort(arr);
        Arrays.sort(nums);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums));*/


        /*while(left<arr.length && right<nums.length){
            if (arr[left]<=nums[right]){
                ans[index++]=arr[left++];

            }else {
                ans[index++]=nums[right++];

            }
        }
        while(left<arr.length){
            ans[index++]=arr[left++];
        }
        while(right<nums.length){
            ans[index++]=nums[right++];
        }
        System.out.println(Arrays.toString(ans));
        for (int i = 0; i < ans.length; i++) {
            if (i<arr.length){
                arr[i]=ans[i];
            }else{
                nums[i-arr.length]=ans[i];
            }
        }
        ;*/

