package A2zDSA;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};

        System.out.println(search(arr,5));
    }
    public static int search(int[] nums ,int val){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==val){
                return i;
            }
        }
        return -1;
    }
}
