package A2zDSA;

public class basicrecursion {

    public static void main(String[] args) {
        int num=5;
//        sumofnterms(num,0);
        System.out.println(SUmOFTerms(num));
//        printNos(num);
//        System.out.println(sumOfSeries(num));
    }
    public static int SUmOFTerms(int n){
        if (n<1){
            return 0;
        }
        return n*n*n + SUmOFTerms(n-1);
    }
//      parameterized recurion

//    public static void sumofnterms(int n,int sum){
//        if (n<1){
//            System.out.println(sum);
//            return;
//        }
//        sumofnterms(n-1,sum+n*n*n);
//    }
//    public static long sumOfSeries(long n)
//    {
//        // code here
//        printcube(n,0);
//    }

//    public static void printcube(long n,long sum){
//        if (n>0){
//            sum= sum+(n*n*n);
//            printcube(n-1,sum);
//        }
//        System.out.println(sum);
//        return
//    }
//    public static void printNos(int N) {
//        // code here
//        if (N==0){
//            return;
//        }
//        System.out.print(N+" ");
//        printNos(N-1);
//    }
//    public static void printNos(int N){
//        if (N>0){
//            printNos(N-1);
//            System.out.print(N+" ");
//
//        }
//        return;
//
//    }
}
