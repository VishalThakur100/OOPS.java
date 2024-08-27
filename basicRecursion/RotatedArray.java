package basicRecursion;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,8,9,1,2,3};
        System.out.println(RBS(arr,2,0,arr.length-1));
    }

    private static int RBS(int[] arr, int t, int s, int e) {
        if (s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if (arr[m]==t){
            return m;
        }
       if (arr[s]< arr[m]){
           if (t < arr[m] && t>=arr[s]){
               return RBS(arr,t,s,m-1);
           }
           else {
               return RBS(arr,t,m+1,e);
           }
       }
       if (t>arr[m]&&t<arr[e]){
           return RBS(arr,t,m+1,e);
       }
       return RBS(arr,t,s,m-1);
    }
}
