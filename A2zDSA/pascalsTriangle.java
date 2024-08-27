package A2zDSA;

import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {
    public static void main(String[] args) {
//        System.out.println(findNcR(6,2));
//        System.out.println(findRow(6));
        System.out.println(nthRow(6));
        System.out.println(generate(6));
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            result.add(nthRow(i));
        }
        return result;
    }

    //    to find NcR
//    rather than find NcR  find (N-1)c(R-1)   to find the pascals element
//    type 1 question when row and column is given and have to find the element
    private static long findNcR(int n, int r) {    // time complexity  O(r [no. of column])
        int N=n-1;
        int R=r-1;
        long res=1;
        for (int i = 0; i < R; i++) {
            res=res*(N-i);
            res=res/(i+1);
        }
        return res;
    }

//    type 2 to find the entire row of the pascal triangle

    public static ArrayList<Long> findRow(int n){    //  time complexity O(n*r)
        ArrayList<Long> ans=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ans.add(findNcR(n,i));
        }
        return ans;
    }
    //   type 2  more optimal approach
    public static ArrayList<Integer> nthRow(int n){
        ArrayList<Integer> ans=new ArrayList<>();
        int num=1;
        ans.add(1);
        for (int i = 1; i < n; i++) {
            num=num*(n-i);
            num=num/i;
            ans.add(num);
        }
        return ans;
    }
    



}
