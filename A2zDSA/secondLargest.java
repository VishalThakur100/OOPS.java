package A2zDSA;

public class secondLargest {
    public static void main(String[] args) {
        //  assuming there is no negative numbers in the array
        int[] arr={3,1,2,89,90};
        int sLargest=secondlargest(arr,arr.length);
        int sSmallest=secondSmallest(arr,arr.length);
        System.out.println("Second Largest"+" "+sLargest);
        System.out.println("Second Smallest"+" "+sSmallest);

    }

    private static int secondSmallest(int[] arr, int n) {
        int smallest=arr[0];
        int secondSmallest=Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            }
            else if (arr[i]>smallest && arr[i]<secondSmallest){
                secondSmallest=arr[i];
            }
        }
        return secondSmallest;
    }

    private static int secondlargest(int[] arr, int n) {
        int largest=arr[0];
        int secondlargest=-1;
        for (int i = 1; i < n; i++) {
            if (arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }else if (arr[i]<largest&&arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
}
