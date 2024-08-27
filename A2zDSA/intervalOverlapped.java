package A2zDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intervalOverlapped {
    public static void main(String[] args) {
        int[][] arr={
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };
        System.out.println(Arrays.deepToString(merge(arr)));
    }
    public static int[][] merge(int[][] intervals) {
//        Arrays.sort(intervals[][]);
        int n=intervals.length;
        List<List<Integer>> ans=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(ans.isEmpty() || intervals[i][0]>ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }
            else {
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(i),intervals[i][1]));
            }
        }

        /*for (int i = 0; i < n; i++) {
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(!ans.isEmpty()  &&  end<= ans.get(ans.size() - 1).get(1)) continue;
            for (int j = i+1; j < n; j++) {
                if(intervals[j][0]<=end){
                    end=Math.max(end,intervals[j][1]);
                }else{
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
        }*/
        int[][] res=new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < 2; j++) {
                res[i][j]=ans.get(i).get(j);
            }
        }
        return res;
    }
}
