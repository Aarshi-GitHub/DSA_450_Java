/*
Description of Question : https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1
Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3

*/

import java.util.*;

class CountInversion{

    static long mergeCount(long arr[],int s,int mid,int e){
        int n = e-s+1;
        int i = s,j=mid;
        long count=0;
        int k=0;
        long temp[] = new long[n];
        while(i<mid && j<=e){
            if(arr[i]<=arr[j])
                temp[k++] = arr[i++];
            else{
                count+=(mid-i);
                temp[k++] = arr[j++];
            }
        }
        while(i<mid) temp[k++] = arr[i++];
        while(j<=e) temp[k++] = arr[j++];
        for(i=s,k=0;i<=e;i++,k++){
            arr[i] = temp[k];
        }
        return count;
    }
    
    static long mergeSortCount(long arr[],int s,int e){
        if(s<e){
            int mid = (s+e)/2;
            long count1 = mergeSortCount(arr,s,mid);
            long count2 = mergeSortCount(arr,mid+1,e);
            long count3 = mergeCount(arr,s,mid+1,e);
            return count1+count2+count3;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(mergeSortCount(arr,0,n-1));
    }
}
