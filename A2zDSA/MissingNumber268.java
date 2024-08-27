package A2zDSA;

public class MissingNumber268 {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        System.out.println( findmissingNo(arr));
    }
    public static int findmissing(int[] nums){
            int[] arr=new int[nums.length+1];
            for (int i = 0; i < nums.length; i++) {
                arr[nums[i]]=nums[i];
            }
            for (int i = 1; i < arr.length; i++) {
                if (arr[i]==0){
                    return i;
                }
            }
            return 0;
    }

    //  optimal approach
    public static int findmissingNo(int[] nums){
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int s=0;
        for (int i = 0; i < n; i++) {
            s+=nums[i];
        }
        return sum-s;
    }
}
