/*
Description of Question : https://leetcode.com/problems/merge-intervals/description/
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
*/

import java.util.*;

class MergeIntervals{

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        int j=0;
        for(int i=1;i<intervals.length;i++){
            int interval[] = res.get(j);
            if(intervals[i][0]<=interval[1])
                interval[1] = Math.max(interval[1],intervals[i][1]);
            else{
                res.add(intervals[i]);
                j++;
            }
        }
        int ans[][] = new int[j+1][2];
        for(int i=0;i<=j;i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int res[][] = merge(arr);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i][0]+" "+res[i][1]);
        }
    }
}
