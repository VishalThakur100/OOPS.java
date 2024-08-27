package A2zDSA;

import java.util.ArrayList;
import java.util.Arrays;

public class AllfactoriaNUmber {
    public static void main(String[] args) {
        int num=6;
//        int ans= Arrays.toString();
        System.out.println(factorialNumbers(num));
    }
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
//        ArrayList<Integer> list=new ArrayList<>();
        return printallFact(n,1,1,new ArrayList<>());
    }
    public static ArrayList<Long> printallFact(long n,long fact,int x,ArrayList<Long> list){
        x++;
        if (fact>n){
            return list;
        }
//        long ans=fact;
        list.add(fact);
       return printallFact(n,fact*x,x,list);
    }
//    public static void factorialNumbers(long n) {
//        // code here
//       int fact=1;
//       int num=2;
//       while(fact<=n){
//           System.out.print(fact+" ");
//           fact=fact*num;
//           num++;
//       }
//
//    }
}
