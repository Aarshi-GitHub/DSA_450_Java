/*
Description of Question : https://www.geeksforgeeks.org/merge-two-sorted-arrays/
Input: arr1[] = { 1, 3, 4, 5},  arr2[] = {2, 4, 6, 8} 
Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
Time Complexity : O(n1 + n2) 
Auxiliary Space : O(n1 + n2)
Space used for storing result other wise we can print result and then
Space Complexity will be : O(1)
*/

import java.util.*;

class MergeSorted{
    
    public static void mergeArrays(int a[],int b[],int n1,int n2,int c[]){
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<n1) c[k++] = a[i++];
        while(j<n2) c[k++] = b[j++];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for(int i=0;i<n1;i++) arr1[i] = sc.nextInt();
        for(int i=0;i<n2;i++) arr2[i] = sc.nextInt();
        int[] arr3 = new int[n1+n2];
        mergeArrays(arr1, arr2, n1, n2, arr3);
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");
    }
}
