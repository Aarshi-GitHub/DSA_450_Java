/*
Description of Question : https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
Input:
N = 11 
arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} 
Output: 3 
Time Complexity: O(N)
Space Complexity: O(1)
*/

import java.util.*;

class MinJump{
    
    static int minJumps(int[] arr,int n){
        if(n==1) return 0;
        if(arr[0]==0) return -1;
        int maxR = arr[0];
        int step = arr[0];
        int jump = 1;
        for(int i=1;i<n;i++){
            if(i==n-1) return jump;
            maxR = Math.max(maxR,i+arr[i]);
            step--;
            if(step==0){
                jump++;
                if(i>=maxR) return -1;
                step = maxR - i;
            }
        }
        return jump;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println(minJumps(arr,n));
    }
}
