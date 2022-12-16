/*
Description of Question : https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1
Input: 
N = 4 , M = 4
Arr[][] = {{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}}
Output: 2
*/

import java.util.*;

class RowMaxOne{
    
    static int countOne(int arr[]){
        int s = 0;
        int e = arr.length-1;
        int res = -1;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]==1){
                res = mid;
                e = mid-1;
            }
            else s = mid+1;
        }
        if(res==-1) return -1;
        return arr.length-res;
    }
    
    static int rowWithMax1s(int arr[][], int n, int m) {
        int prevMax = 0;
        int r = 0;
        for(int i=0;i<n;i++){
            int cur = countOne(arr[i]);
            if(cur==-1 && prevMax==0) r = -1;
            if(cur>prevMax){ r = i; prevMax = cur;}
        }
        return r;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) arr[i][j] = sc.nextInt();
        }
        System.out.println(rowWithMax1s(arr,n,m));
    }
}
