package A2zDSA;

public class MooresVotingAlgo {
//    static int ele;
    public static void main(String[] args) {
        int[] arr={3,2,3};

        System.out.println(moores(arr));
    }

    private static int moores(int[] nums) {
        int count=0;
        int ele=-1;
        for (int i = 0; i < nums.length; i++) {
            if(count==0){
                ele=nums[i];
                count++;
            }else if(nums[i]==ele){
                    count++;
            }else {
                    count--;
            }
        }
        return ele;
    }
}
