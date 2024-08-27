package A2zDSA;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr={3,4,8,9,0,1};
        System.out.println(leaders(arr.length,arr));
    }
    public static ArrayList<Integer> leaders(int n, int[] arr) {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                ans.add(arr[i]);
                max=arr[i];
            }
        }
//        System.out.println(ans);
        int start=0;
        int end=ans.size()-1;
        while(start<end){
            swap(ans,start,end);
            start++;
            end--;
        }
        return ans;
    }

    private static void swap(ArrayList<Integer> ans, int start, int end) {
        int temp=ans.get(start);
        ans.set(start,ans.get(end));
        ans.set(end,temp);
    }
}
