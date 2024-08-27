package A2zDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1={1, 2, 3, 4, 5};
        int[] arr2= {1, 2, 3, 6, 7};
//        findUnion(arr1,arr2);
        System.out.println(findUnion(arr1,arr2, arr1.length,arr2.length));

    }
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        int i=0;
        int j=0;
        int temp=-1;
        ArrayList<Integer> ans=new ArrayList<>();
        while(i<n && j<m){
            if (arr1[i]<=arr2[j]){
                if (ans.size()==0 || arr1[i]!=ans.get(temp)){
                    ans.add(arr1[i]);
                    temp++;
                }
                i++;
            }
            else {
                if (ans.size()==0|| arr2[j]!=ans.get(temp)){
                    ans.add(arr2[j]);
                    temp++;
                }
                j++;
            }
        }
        while(j<m){
            if (ans.size()==0|| arr2[j]!=ans.get(temp)){
                ans.add(arr2[j]);
                temp++;
            }
            j++;

        }
        while(i<n){
            if (ans.size()==0 || arr1[i]!=ans.get(temp)){
                ans.add(arr1[i]);
                temp++;
            }
            i++;
        }

        return ans;

    }

    //  brute force approach
//    public static void findUnion(int[] arr,int[] nums){
//        Set<Integer> st=new HashSet<>();
//        for (int j : arr) {
//            st.add(j);
//        }
//        for (int num : nums) {
//            st.add(num);
//        }
//        ArrayList<Integer> list=new ArrayList<>();
//        for (int a: st
//             ) {
//            System.out.print(a+" ");
//        }
//    }
}
