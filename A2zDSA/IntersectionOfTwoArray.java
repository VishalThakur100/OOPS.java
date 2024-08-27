package A2zDSA;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

//    public static int[] intersection(int[] nums1, int[] nums2){
//        int i=0;
//        int j=0;
//        ArrayList<Integer> ans = new ArrayList<>(5);
//        int temp=-1;
//        while(i<nums1.length && j<nums2.length){
//            if (nums1[i]>nums2[j]){
//                j++;
//            } else if (nums1[i]<nums2[j]) {
//                i++;
//            } else if (nums1[i]==nums2[j] && ans.size()==0 || ans.get(temp)!=nums1[i]) {
//                ans.add(nums1[i]);
//                i++;
//                j++;
//                temp++;
//            } else {
//               i++;
//            }
//        }
//        int[] arr=new int[ans.size()];
//        for (int k = 0; k < ans.size(); k++) {
//            arr[k]=ans.get(k);
//        }
//        return arr;
//    }

    //  brute force approach
    public static int[] intersection(int[] nums1, int[] nums2) {
//        int[] visi=new int[nums2.length];
        // int[] ans=new int[nums1.length+nums2.length];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
                if(check(nums1[i],nums2)){
                    if (!checkList(ans,nums1[i])){
                        ans.add(nums1[i]);
                    }
                }
        }
        int[] arr=new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i]=ans.get(i);
        }
        return arr;

    }
    public static boolean check(int val,int[] nums2){
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i]==val){
                return true;
            }
        }
        return false;
    }
    public static boolean checkList(ArrayList<Integer> nums2,int val){
        for (int i = 0; i < nums2.size(); i++) {
            if (nums2.get(i)==val){
                return true;
            }
        }
        return false;
    }

}
