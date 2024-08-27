package A2zDSA;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[]arr={3,5,2,8,0};
//        merge(arr,3,);
        Arrays.sort(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }
    /*public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 1st optimal approach
        int left = m - 1;
        int right = 0;
        while (left >= 0 && right < n) {
            if (nums1[left] > nums2[right]) {
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }
        if(m>1){
            Arrays.sort(nums1,0,m-1);
        }
        Arrays.sort(nums2);
        for (int i = m; i < m + n; i++) {
            nums1[i]=nums2[i-m];
        }
    }*/
}
