package A2zDSA;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfTwoArray {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={3,2,1};
        System.out.println(Arrays.toString(findArraySum(a,a.length,b,b.length)));
//        findArraySum(a,a.length,b,b.length);
    }
    public static int[] reverse(ArrayList<Integer> ans){
        int s=0;
        int e=ans.size()-1;

        int[] arr = new int[ans.size()];
        while(s<ans.size()){
            arr[s]=ans.get(e);
            s++;
            e--;
        }
//        while(s<e){
//            int temp=ans.get(s);
//            arr[s]=ans.get(e);
//            arr[e]=temp;
//
//            s++;
//            e--;
//        }
//        if (s==e){
//            arr[s]=ans.get(s);
//        }
        return arr;
    }
    public static int[] findArraySum(int[] a, int n, int[] b, int m) {

        // Write your code here.
        ArrayList<Integer> ans=new ArrayList<>();
        int i=n-1;
        int j=m-1;
        int carry=0;
        while(i>=0 && j>=0){
            int sum=a[i] + b[j] + carry;
            carry=sum/10;
            sum=sum%10;
            ans.add(sum);
            i--;
            j--;
        }
        while(j>=0){
            int sum=b[j] + carry;
            carry=sum/10;
            sum=sum%10;
            ans.add(sum);
            j--;
        }
        while(i>=0){
            int sum=a[i] + carry;
            carry=sum/10;
            sum=sum%10;
            ans.add(sum);
            i--;
        }
        while(carry!=0){
            int sum=carry;
            carry=sum/10;
            sum=sum%10;
            ans.add(sum);
        }
//        System.out.println(ans);
        return reverse(ans);


    }
}
