package A2zDSA;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        String str="madam";
        System.out.println(StringCheck(0,str));

    }

    private static boolean StringCheck(int i, String str) {
        if (i>=str.length()/2){
            return true;
        }
        if (str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }
        return StringCheck(i+1,str);
    }
}
