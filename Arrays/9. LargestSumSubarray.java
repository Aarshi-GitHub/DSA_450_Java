/*
Description of Question : https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Time Complexity: O(N)
Auxiliary Space: O(1)
*/

import java.util.*;

class LargestSumSubarray{
    
    public static int KadaneSum(int arr[],int n){
        int sum=Integer.MIN_VALUE;
        int cur=0;
        for(int i=0;i<n;i++){
            cur+=arr[i];
            sum = Math.max(sum,cur);
            if(cur<0) cur=0;
        }
        return sum;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) 
            arr[i] = sc.nextInt();
        System.out.println(KadaneSum(arr,n));
        
    }
}
