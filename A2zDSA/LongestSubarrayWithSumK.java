package A2zDSA;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr={10, 5, 2, 7, 1, 9};
        System.out.println( lenOfLongSubarr(arr, arr.length, 15));
    }

    private static int lenOfLongSubarr(int[] A,int N,int K) {
        int right=0;
        int left=0;
        long sum=A[0];
        int maxLen=0;
        while(right<N){
            while(left<=right && sum>K){
                sum-=A[left];
                left++;
            }

            if (sum==K){
                maxLen=Math.max(maxLen,right-left+1);
            }
            right++;
            if (right<N){
                sum+=A[right];
            }
        }
        return maxLen;
    }
}
