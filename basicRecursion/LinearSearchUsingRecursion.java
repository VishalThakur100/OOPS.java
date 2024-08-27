package basicRecursion;

import java.util.ArrayList;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr={2,4,6,4,4,1,0};

//        System.out.println(Search2(arr,4,0));
//        System.out.println(Search(arr,4,0));
//        findAllIndex(arr,4,0);
        System.out.println(findAllIndex2(arr,4,0,new ArrayList<>()));
//        System.out.println(list);
//        System.out.println(findWithLastIndex(arr,1,arr.length-1));
    }

    private static ArrayList<Integer> findAllIndex2(int[] arr, int t, int n, ArrayList<Integer> list) {
        if (n==arr.length){
            return list;
        }
        if (arr[n]==t){
            list.add(n);
        }
        return findAllIndex2(arr,t,n+1,list);
    }

    private static int findWithLastIndex(int[] arr, int t, int n) {
        if (n==-1){
            return -1;
        }
        if (arr[n]==t){
            return n;
        }else {
            return findWithLastIndex(arr,t,n-1);
        }
    }

    static ArrayList<Integer> list=new ArrayList<>();
    private static void findAllIndex(int[] arr, int t, int n) {
        if (n==arr.length){
            return;
        }
        if (arr[n]==t){
            list.add(n);
        }
        findAllIndex(arr,t,n+1);
    }

    private static int Search2(int[] arr, int t, int x) {
        if (x==arr.length){
            return -1;
        }
        if (arr[x]==t){
            return x;
        }

        else{
            return Search2(arr,t,x+1);
        }
    }


//    very important example

    private static boolean Search(int[] arr,int Target,int n) {

        if (n==arr.length) {
            return false;
        }
        return arr[n]==Target||Search(arr,Target,n+1);
    }
}
