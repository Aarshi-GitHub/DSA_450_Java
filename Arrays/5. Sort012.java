/*
link to Question : https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
*/

import java.util.*;

class Sort012{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(low<n && arr[low]==0) low++;
        low = mid;
        while(mid<n && arr[mid]==1) mid++;
        while(high>=0 && arr[high]==2) high--;
        while(mid<=high){
            if(arr[mid]==0){
                arr[mid] = arr[low];
                arr[low] = 0;
                low++;
                mid++;
            }
            else if(arr[mid]==1) mid++;
            else{
                arr[mid] = arr[high];
                arr[high] = 2;
                high--;
            }
        }
        for(int ele : arr)
            System.out.print(ele+" ");
    }
}
