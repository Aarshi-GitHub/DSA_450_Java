/*
Description of Question : https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
*/

import java.util.*;

class ValueEqualToIndex{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==i+1) System.out.println(arr[i]);
        }
    }
}
