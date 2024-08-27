package A2zDSA;

public class CheckPhasePalindrome {
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
//        String a=str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
//        System.out.println(a);
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String s) {
        String a=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        return checkPalindrome(0,a);
    }

    private static boolean checkPalindrome(int i,String s) {
        if (i>=s.length()/2){
            return true;
        }
        if (s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return checkPalindrome(i+1,s);
    }
}
