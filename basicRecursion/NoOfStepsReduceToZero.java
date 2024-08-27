package basicRecursion;

public class NoOfStepsReduceToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(41));
    }

    private static int numberOfSteps(int num) {
        return helper(num,0);
    }

    private static int helper(int num, int i) {
        if (num==0){
            return i;
        }
        if(num%2==0){
            return helper(num/2,i+1);
        }

        return helper(num-1,i+1);
    }
}
