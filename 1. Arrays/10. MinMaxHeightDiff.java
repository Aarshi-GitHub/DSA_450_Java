/*
Description of Question : https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1
Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as 
{3, 3, 6, 8}. The difference between 
the largest and the smallest is 8-3 = 5.
*/

import java.util.*;

class MinMaxHeightDiff{
    
    public static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int res = arr[n-1] - arr[0];
        int lg = arr[n-1] - k;
        int sm = arr[0] + k;
        int mi,ma;
        for(int i=1;i<n;i++){
            mi = Math.min(sm,arr[i]-k);
            ma = Math.max(lg,arr[i-1]+k);
            if(mi<0) continue;
            res = Math.min(res,ma-mi);
        }
        return res;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println(getMinDiff(arr,n,k));
    }
}
