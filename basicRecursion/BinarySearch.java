package basicRecursion;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={2,5,8,10,15,18,20,22,27};
        System.out.println(bs(arr,0,arr.length-1,22));
    }
    private static int bs(int[] arr,int s,int e,int target) {
        if (s>e)
           return -1;
        int mid=s+(e-s)/2;
        if (arr[mid]==target)
               return mid;
        if(target<arr[mid])
               return bs(arr,0,mid-1,target);
        return bs(arr,mid+1,e,target);
    }
}
